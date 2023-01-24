package com.jnsdev.microservices.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CircuitBreakerController {

      @GetMapping(value = "/sample-api")
      public String sampleApi() {
            return "Sample API";
      }

}
