package com.jnsdev.hexagonal.adapters.out;

import com.jnsdev.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.jnsdev.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.jnsdev.hexagonal.adapters.out.client.response.AddressResponse;
import com.jnsdev.hexagonal.application.core.domain.Address;
import com.jnsdev.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:13
 */
@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
