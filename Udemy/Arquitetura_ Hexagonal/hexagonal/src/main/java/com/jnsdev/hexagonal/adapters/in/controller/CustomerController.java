package com.jnsdev.hexagonal.adapters.in.controller;

import com.jnsdev.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.jnsdev.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.jnsdev.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.jnsdev.hexagonal.application.core.domain.Customer;
import com.jnsdev.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.jnsdev.hexagonal.application.ports.in.InsertCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:43
 */
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {

        var customer = customerMapper.toCustomer(customerRequest);

        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);

        var customerResponse = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok(customerResponse);
    }
}
