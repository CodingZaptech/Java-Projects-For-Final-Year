// Controller to handle hospital and patient-related endpoints
// Provides APIs for adding patients, listing patients, and viewing hospital info
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    @GetMapping("/patients")
    public String listPatients() {
        return "List of all patients";
    }

    @PostMapping("/patients/add")
    public String addPatient() {
        return "New patient added successfully!";
    }

    @GetMapping("/hospital/info")
    public String hospitalInfo() {
        return "General hospital information";
    }
}
