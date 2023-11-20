package ActiveDirectory.demo.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/human")
//    @PreAuthorize("hasAuthority('api://aea554f2-1795-482a-a62d-d6d5bc530b2c/Files.Read')")
//    @PreAuthorize("hasAuthority('Files.Read')")
//    @PreAuthorize("hasAuthority('Admin')")
    public String hello() {
        return "Hi, Human! How are you?";
    }
}

