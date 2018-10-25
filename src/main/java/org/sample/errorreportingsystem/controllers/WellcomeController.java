package org.sample.errorreportingsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WellcomeController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }
}
