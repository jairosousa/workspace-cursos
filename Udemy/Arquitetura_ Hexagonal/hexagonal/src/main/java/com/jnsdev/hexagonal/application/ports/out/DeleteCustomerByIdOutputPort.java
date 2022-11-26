package com.jnsdev.hexagonal.application.ports.out;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 16:29
 */
public interface DeleteCustomerByIdOutputPort {

    void delete(String id);
}
