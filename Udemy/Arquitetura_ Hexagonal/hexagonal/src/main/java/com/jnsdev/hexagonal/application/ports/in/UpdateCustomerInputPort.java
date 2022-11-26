package com.jnsdev.hexagonal.application.ports.in;

import com.jnsdev.hexagonal.application.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 16:22
 */
public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
