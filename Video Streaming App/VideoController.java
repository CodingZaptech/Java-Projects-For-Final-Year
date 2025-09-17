// Controller to handle video streaming related endpoints
// Provides APIs like listing videos and streaming a specific video
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @GetMapping("/videos")
    public String listVideos() {
        return "List of available videos";
    }

    @GetMapping("/stream/{id}")
    public String streamVideo(@PathVariable String id) {
        return "Streaming video with ID: " + id;
    }
}
