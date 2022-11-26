package com.jnsdev.hexagonal.application.core.usecase;

import com.jnsdev.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.jnsdev.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 16:27
 */
public class DeleteCustumerByIdUseCase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustumerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
