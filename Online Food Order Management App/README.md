# Online Food Order Management App (Backend)

The backend application for placing, viewing, and canceling food orders. Useful for restaurants and online food delivery platforms.

## Features
- Place food order
- View all food orders
- Cancel food order

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run

mvn spring-boot: run

POST /orders – place food order (JSON body)

GET /orders – all food orders

DELETE /orders/{id} – cancel food order
