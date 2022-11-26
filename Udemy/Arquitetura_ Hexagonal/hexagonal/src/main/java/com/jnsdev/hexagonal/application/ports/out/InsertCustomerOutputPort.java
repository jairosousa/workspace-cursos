package com.jnsdev.hexagonal.application.ports.out;

import com.jnsdev.hexagonal.application.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:29
 */
public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
