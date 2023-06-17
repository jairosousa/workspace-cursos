package com.jnsdev.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jnsdev.microservices.currencyconversionservice.bean.CurrencyConversion;
import com.jnsdev.microservices.currencyconversionservice.proxy.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {

      @Autowired
      private CurrencyExchangeProxy proxy;

      @Value("${currency.exchange.uri}")
      private String currency_exchange_uri;

      @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
      public CurrencyConversion calculatorCurrencyConversion(
                  @PathVariable String from,
                  @PathVariable String to,
                  @PathVariable BigDecimal quantity) {

            HashMap<String, String> uriVariables = new HashMap<>();
            uriVariables.put("from", from);
            uriVariables.put("to", to);

            String url = currency_exchange_uri + "from/{from}/to/{to}";

            ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
                        url, CurrencyConversion.class,
                        uriVariables);

            CurrencyConversion currencyConversion = responseEntity.getBody();

            return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,
                        currencyConversion.getConversionMultiple(),
                        quantity.multiply(currencyConversion.getConversionMultiple()),
                        currencyConversion.getEnvironment() + " RestTemplate");
      }

      @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
      public CurrencyConversion calculatorCurrencyConversionFeign(
                  @PathVariable String from,
                  @PathVariable String to,
                  @PathVariable BigDecimal quantity) {

            CurrencyConversion currencyConversion = proxy.retrieveExchangeValue(from, to);

            return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,
                        currencyConversion.getConversionMultiple(),
                        quantity.multiply(currencyConversion.getConversionMultiple()),
                        currencyConversion.getEnvironment() + " feign");
      }

}
