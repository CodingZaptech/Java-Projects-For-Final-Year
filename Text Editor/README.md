# Text Editor (Backend)

The backend code for creating, reading, updating, and deleting text documents. This simple service stores documents in-memory and is intended for demo or learning use only.

## Features
- Create new document (title + content)
- Read document by ID
- Update document title/content
- List all documents
- Delete document

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot:run

POST /documents – create document (JSON body: {"title":"...", "content":"..."})

GET /documents – list all documents

GET /documents/{id} – get a document by id

PUT /documents/{id} – update a document (JSON body with "title" and/or "content")

DELETE /documents/{id} – delete a document
