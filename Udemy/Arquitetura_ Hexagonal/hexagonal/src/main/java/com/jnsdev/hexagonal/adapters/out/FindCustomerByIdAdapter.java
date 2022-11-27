package com.jnsdev.hexagonal.adapters.out;

import com.jnsdev.hexagonal.adapters.out.repository.CustomerRepository;
import com.jnsdev.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import com.jnsdev.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:09
 */
@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
