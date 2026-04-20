package com.example.demo;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entities")
public class EntityController {
    private final Counter entityCounter;

    // Единственный конструктор — Spring использует его для внедрения зависимостей
    public EntityController(MeterRegistry registry) {
        this.entityCounter = Counter.builder("app.entities.created")
                .description("Total created entities")
                .register(registry);
    }

    @PostMapping
    public ResponseEntity<String> create() {
        entityCounter.increment();
        return ResponseEntity.ok("Created");
    }

    @GetMapping("/fail")
    public ResponseEntity<String> fail() {
        throw new RuntimeException("Simulated 500");
    }
}
