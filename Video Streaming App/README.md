# Video Streaming App (Backend)

The complete backend for listing and streaming video content. It provides simple APIs to deliver and play videos.  

## Features
- List available videos
- Stream videos by ID
- Basic playback support

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

## Run
mvn spring-boot: run

GET /videos – list all videos

GET /stream/{id} – stream a video by ID
