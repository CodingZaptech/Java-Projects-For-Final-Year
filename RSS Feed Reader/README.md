# RSS Feed Reader (Backend)

To manage RSS feeds in any application, the backend code has been introduced.

## Features
- Add new feed
- View all feeds
- Delete feed

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /feeds – all feeds

POST /feeds – add feed (JSON body)

DELETE /feeds/{id} – delete feed
