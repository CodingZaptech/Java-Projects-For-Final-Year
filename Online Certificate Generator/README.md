# Online Certificate Generator App (Backend)

The complete backend code for generating and managing online certificates.

## Features
- Generate new certificate
- View all certificates
- Delete certificate

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /certificates – all certificates

POST /certificates – generate certificate (JSON body)

DELETE /certificates/{id} – delete certificate
