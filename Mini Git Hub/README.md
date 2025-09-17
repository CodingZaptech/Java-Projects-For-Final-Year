# Mini GitHub (Backend)

The backend application for managing repositories like GitHub.

## Features
- Create repository
- View all repositories
- Delete repository

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /repos – all repositories

POST /repos – create repository (JSON body)

DELETE /repos/{id} – delete repository
