package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Value("${hello}") String hh;

  @GetMapping("/show")
  public String showString() {
    return "The String is: " + hh;
  }
}