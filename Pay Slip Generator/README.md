# Pay Slip Generator (Backend)

For generating and managing pay slips in any organization, this full backend code can be utilized.

## Features
- Generate new pay slip
- View all pay slips
- Delete pay slip

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /payslips – all pay slips

POST /payslips – generate pay slip (JSON body)

DELETE /payslips/{id} – delete pay slip
