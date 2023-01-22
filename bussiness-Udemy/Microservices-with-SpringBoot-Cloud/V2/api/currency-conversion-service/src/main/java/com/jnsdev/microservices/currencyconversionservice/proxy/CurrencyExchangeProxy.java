package com.jnsdev.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jnsdev.microservices.currencyconversionservice.bean.CurrencyConversion;


@FeignClient(name = "currency-exchange", url = "http://localhost:8000")
public interface CurrencyExchangeProxy {

      @GetMapping("/currency-exchange/from/{from}/to/{to}")
      public CurrencyConversion retrieveExchangeValue(
                  @PathVariable String from,
                  @PathVariable String to);

}
