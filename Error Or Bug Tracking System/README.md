# Error or Bug Tracking System (Backend)

The only backend application for managing software bugs and errors.

## Features
- Add new bug report
- View all bugs
- Delete bug

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /bugs – all bugs

POST /bugs – add bug (JSON body)

DELETE /bugs/{id} – delete bug
