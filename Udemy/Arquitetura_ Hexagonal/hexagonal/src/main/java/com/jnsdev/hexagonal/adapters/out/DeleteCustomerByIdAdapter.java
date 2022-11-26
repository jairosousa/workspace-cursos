package com.jnsdev.hexagonal.adapters.out;

import com.jnsdev.hexagonal.adapters.out.repository.CustomerRepository;
import com.jnsdev.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 16:33
 */
@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
