package com.jnsdev.hexagonal.application.ports.out;

import com.jnsdev.hexagonal.application.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 06:42
 */
public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
