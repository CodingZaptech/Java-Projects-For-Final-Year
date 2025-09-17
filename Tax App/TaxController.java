// Controller to handle tax-related endpoints
// Provides APIs to calculate and view tax details
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {

    @GetMapping("/calculateTax")
    public String calculateTax(@RequestParam double income) {
        double tax = income * 0.1; // Simple 10% tax for demo
        return "Calculated tax for income " + income + " is: " + tax;
    }

    @GetMapping("/info")
    public String taxInfo() {
        return "Basic tax calculation info";
    }
}
