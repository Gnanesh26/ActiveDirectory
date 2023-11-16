package ActiveDirectory.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/human")
    public String hello() {
        return "H!, Human how are you ? ? ?";
    }
}

