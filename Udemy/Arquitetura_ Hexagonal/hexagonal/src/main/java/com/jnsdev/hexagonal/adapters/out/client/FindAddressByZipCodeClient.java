package com.jnsdev.hexagonal.adapters.out.client;

import com.jnsdev.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:56
 */
@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${jnsdev.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
