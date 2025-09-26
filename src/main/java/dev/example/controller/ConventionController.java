package dev.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/convention")
public class ConventionController {

    /**
     * upperConvention 주석
     */
    @GetMapping("/upper")
    public void upperConvention() {
        System.out.println("processUserData - convention");
    }


}
