package org.example.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/bye")
    public String sayGoodbye() {
        return "Bye, World";
    }
}