package com.jnsdev.hexagonal.adapters.in.consumer.mapper;

import com.jnsdev.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 18:26
 */
@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustumer(CustomerMessage customerMessage);
}
