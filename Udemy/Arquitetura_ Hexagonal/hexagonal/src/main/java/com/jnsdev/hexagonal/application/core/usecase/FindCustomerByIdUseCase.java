package com.jnsdev.hexagonal.application.core.usecase;

import com.jnsdev.hexagonal.application.core.domain.Customer;
import com.jnsdev.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.jnsdev.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:01
 */
public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
