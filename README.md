Репозиторий подготовлен под тестовый проект.

Состав:
- Java 17+
- Spring Boot 3.x
- Micrometer
- Prometheus
- Grafana

Использование:
- билдим приложение java
docker-compose build --no-cache
- запускаем стек grafana prometheus java-app
docker-compose up -d
- остановка стека
docker-compose down
