package com.jnsdev.hexagonal.application.ports.out;

/**
 * @Autor Jairo Nascimento
 * @Created 26/11/2022 - 18:01
 */
public interface SendCpfForValidationOutputPort {

    void send(String cpf);
}
