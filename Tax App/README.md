# Tax App (Backend)

The backend application for calculating and managing taxes. It provides APIs for simple income-based tax calculations.  

## Features
- Calculate tax based on income
- View basic tax info

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /calculateTax?income={amount} – calculate tax

GET /info – view tax info
