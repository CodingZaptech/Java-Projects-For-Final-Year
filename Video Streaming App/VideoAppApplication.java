// Main entry point for the Video Streaming App
// Starts the Spring Boot application to serve video content
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VideoAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoAppApplication.class, args);
    }
}
