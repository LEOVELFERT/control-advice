package com.control_advice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advice")
public class ControlAdviceDemo {

    @GetMapping("/demo/{id}")
    public ResponseEntity<String> checkControlAdvice(@PathVariable String id) {
        if ("leo".equals(id)) {
            throw new RuntimeException("run time exception");
        }
        return new ResponseEntity<>("leovelbert", HttpStatus.OK);
    }
}
