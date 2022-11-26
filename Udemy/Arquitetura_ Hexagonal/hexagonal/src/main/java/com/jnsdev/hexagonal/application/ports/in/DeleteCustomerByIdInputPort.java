package com.jnsdev.hexagonal.application.ports.in;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 16:40
 */
public interface DeleteCustomerByIdInputPort {

    void delete(String id);
}
