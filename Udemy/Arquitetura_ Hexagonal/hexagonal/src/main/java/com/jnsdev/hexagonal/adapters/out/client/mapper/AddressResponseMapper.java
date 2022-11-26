package com.jnsdev.hexagonal.adapters.out.client.mapper;

import com.jnsdev.hexagonal.adapters.out.client.response.AddressResponse;
import com.jnsdev.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:16
 */
@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
