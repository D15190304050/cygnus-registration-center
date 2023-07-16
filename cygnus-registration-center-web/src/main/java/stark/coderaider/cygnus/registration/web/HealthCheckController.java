package stark.coderaider.cygnus.registration.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/health")
public class HealthCheckController
{
    @GetMapping("/hello")
    public String hello()
    {
        log.info("Enter hello()...");
        return "hello";
    }
}
