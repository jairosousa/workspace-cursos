package com.jnsdev.hexagonal.application.ports.in;

import com.jnsdev.hexagonal.application.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:48
 */
public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
