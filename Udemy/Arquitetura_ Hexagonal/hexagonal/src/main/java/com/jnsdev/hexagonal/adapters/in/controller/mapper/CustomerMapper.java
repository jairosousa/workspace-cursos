package com.jnsdev.hexagonal.adapters.in.controller.mapper;

import com.jnsdev.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.jnsdev.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:52
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
