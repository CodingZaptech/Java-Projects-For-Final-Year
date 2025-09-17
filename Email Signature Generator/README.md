# Email Signature Generator App (Backend)

The backend application for generating and managing email signatures without any hassle.

## Features
- Create new email signature
- View all signatures
- Delete signature

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /signatures – all signatures

POST /signatures – create signature (JSON body)

DELETE /signatures/{id} – delete signature
