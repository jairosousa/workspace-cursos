package com.jnsdev.hexagonal.application.ports.out;

import com.jnsdev.hexagonal.application.core.domain.Customer;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:02
 */
public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
