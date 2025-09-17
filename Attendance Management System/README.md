# Attendance Management System (Backend)

The backend application for managing attendance records has been written in this repository.

## Features
- Add new attendance record
- View all records
- Delete record

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /attendance – all attendance records

POST /attendance – add record (JSON body)

DELETE /attendance/{id} – delete record
