// Controller to handle car rental related endpoints
// Provides APIs to list cars, rent a car, and return a car
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/cars")
    public String listCars() {
        return "List of available cars for rent";
    }

    @PostMapping("/rent/{id}")
    public String rentCar(@PathVariable String id) {
        return "Car with ID " + id + " rented successfully!";
    }

    @PostMapping("/return/{id}")
    public String returnCar(@PathVariable String id) {
        return "Car with ID " + id + " returned successfully!";
    }
}
