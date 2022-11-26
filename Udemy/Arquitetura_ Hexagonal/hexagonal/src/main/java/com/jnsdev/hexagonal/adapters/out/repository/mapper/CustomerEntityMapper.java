package com.jnsdev.hexagonal.adapters.out.repository.mapper;

import com.jnsdev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:38
 */
@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
