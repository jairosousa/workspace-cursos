package com.jnsdev.hexagonal.adapters.in.consumer;

import com.jnsdev.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.jnsdev.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.jnsdev.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 18:21
 */
@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "jnsdev")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustumer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());

    }
}
