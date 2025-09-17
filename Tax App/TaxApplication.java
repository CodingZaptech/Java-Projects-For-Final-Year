// Main entry point for the Tax App
// This sets up the Spring Boot application for tax calculations
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaxApplication.class, args);
    }
}
