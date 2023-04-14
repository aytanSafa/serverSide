package com.ssl.server.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ExamController {

    @GetMapping(value = "/get")
    public ResponseEntity<String> getString(){
        return ResponseEntity.ok("Hello Spring with SSL");
    }

}
