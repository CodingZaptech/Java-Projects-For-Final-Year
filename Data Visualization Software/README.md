# Data Visualization Software (Backend)

The full backend application for managing datasets used in visualization. This app lets you add, view, and delete datasets.

## Features
- Upload dataset
- View all datasets
- Delete dataset

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

POST /datasets – upload dataset (JSON body)

GET /datasets – view all datasets

DELETE /datasets/{id} – delete dataset
