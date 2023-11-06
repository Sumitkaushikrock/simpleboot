package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("rest/{fileName}")
    public String getter(@PathVariable  String fileName){
        return "String"+fileName;
    }
}
