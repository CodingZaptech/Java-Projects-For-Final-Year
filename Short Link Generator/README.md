# Short Link Generator (Backend)

For generating and managing short links, the backend will be helpful. Converts long URLs into short links for easy sharing.

## Features
- Generate short link
- Retrieve original URL
- Delete short link

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run

mvn spring-boot: run

POST /links – generate short link (JSON body)

GET /links/{shortKey} – get original URL

DELETE /links/{shortKey} – delete short link
