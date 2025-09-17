// Controller to handle employee salary and payroll processing
// Provides APIs like viewing salary and generating payroll
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayrollController {

    @GetMapping("/salary")
    public String viewSalary() {
        return "Employee salary details";
    }

    @GetMapping("/generatePayroll")
    public String generatePayroll() {
        return "Payroll generated successfully!";
    }
}
