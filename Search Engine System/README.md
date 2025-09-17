# Search Engine System (Backend)

The backend application for managing search queries in a search engine system.

## Features
- Add new search query
- View all queries
- Delete query

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /queries – all search queries

POST /queries – add query (JSON body)

DELETE /queries/{id} – delete query
