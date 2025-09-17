// Controller to handle job posting and application endpoints
// Provides APIs like posting a job and listing jobs
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @GetMapping("/jobs")
    public String listJobs() {
        return "List of all available jobs";
    }

    @PostMapping("/jobs")
    public String postJob() {
        return "New job posted successfully!";
    }
}
