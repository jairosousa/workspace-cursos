package com.jnsdev.hexagonal.adapters.out;

import com.jnsdev.hexagonal.adapters.out.repository.CustomerRepository;
import com.jnsdev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.jnsdev.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import com.jnsdev.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 06:46
 */
@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
