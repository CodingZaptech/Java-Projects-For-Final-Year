# School Finder System (Backend)

The backend code for managing school information. You can add schools, view the full list, and remove schools.

## Features
- Add school
- View all schools
- Delete school

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

POST /schools – add school (JSON body)

GET /schools – all schools

DELETE /schools/{id} – delete school
