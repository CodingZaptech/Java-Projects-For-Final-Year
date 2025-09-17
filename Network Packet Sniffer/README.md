# Network Packet Sniffer (Backend)

The complete Backend for storing and viewing packet log entries. This service allows you to submit packet logs (in JSON format) and manage them through REST APIs.

## Features
- Upload a packet log entry (JSON)
- View all stored packet entries
- View a packet entry by ID
- Delete a packet entry

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

POST /packets – upload packet entry (JSON body, e.g. timestamp, srcIp, dstIp, protocol, length, info)

GET /packets – list all packet entries

GET /packets/{id} – get a packet entry by id

DELETE /packets/{id} – delete a packet entry
