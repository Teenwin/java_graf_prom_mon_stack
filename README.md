Репозиторий подготовлен под тестовый проект.

Состав:
- Java 17+
- Spring Boot 3.x
- Micrometer
- Prometheus
- Grafana

Использование:
- билдим приложение java
`docker-compose build --no-cache`
- запускаем стек grafana prometheus java-app(вход в графану свободный не нужно логина или пароля, заходить на http://localhost:3000/)
`docker-compose up -d`
Дашборд добавлен как DaC (dashboard as Code), через provisioning и доступен через вкладку `dashboard`
- остановка стека
`docker-compose down`
