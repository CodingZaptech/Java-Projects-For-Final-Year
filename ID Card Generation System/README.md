# ID Card Generation System (Backend)

The full backend application for generating and managing ID cards. This app creates, lists, and deletes ID cards for users.

## Features
- Generate ID card
- View all ID cards
- Delete ID card

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

POST /idcards – generate ID card (JSON body)

GET /idcards – all ID cards

DELETE /idcards/{id} – delete ID card
