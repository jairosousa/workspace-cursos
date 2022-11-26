package com.jnsdev.hexagonal.application.ports.in;

import com.jnsdev.hexagonal.application.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:26
 */
public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
