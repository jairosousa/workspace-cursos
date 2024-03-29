package com.jnsdev.hexagonal.adapters.out;

import com.jnsdev.hexagonal.adapters.out.repository.CustomerRepository;
import com.jnsdev.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import com.jnsdev.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
  * @Autor Jairo Nascimento
  * @Created 25/11/2022 - 21:35
  */
@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
