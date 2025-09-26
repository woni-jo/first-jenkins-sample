package dev.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/violation")
public class ViolationController {

    /**
     * UpperConvention 주석
     */
    @GetMapping("/upper")
    public void UpperConvention() {
        System.out.println("UpperConvention - violation");
    }

    @GetMapping("/annotation")
    public void annotationConvention() {
        System.out.println("annotationConvention - violation");
    }


}
