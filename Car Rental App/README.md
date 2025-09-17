# Car Rental App (Backend)

The backend application for managing car rentals and returns. It provides APIs for customers to rent, view, and return cars.  

## Features
- List available cars
- Rent a car by ID
- Return a rented car

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /cars – list all cars

POST /rent/{id} – rent a car

POST /return/{id} – return a rented car
