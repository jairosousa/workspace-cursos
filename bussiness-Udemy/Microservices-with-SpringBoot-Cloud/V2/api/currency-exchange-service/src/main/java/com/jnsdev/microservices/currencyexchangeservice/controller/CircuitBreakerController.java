package com.jnsdev.microservices.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CircuitBreakerController {

      private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

      // @Retry(name = "sample-api", fallbackMethod = "hardcodeResponse")
      // @CircuitBreaker(name = "default", fallbackMethod = "hardcodeResponse")
      // @RateLimiter(name = "default")
      @Bulkhead(name = "default")
      @GetMapping(value = "/sample-api")
      public String sampleApi() {

            logger.info("Sample Apli call received");
            ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url",
                        String.class);
            return forEntity.getBody();
      }

      public String hardcodeResponse(Exception ex) {
            return "fallback-response";
      }

}
