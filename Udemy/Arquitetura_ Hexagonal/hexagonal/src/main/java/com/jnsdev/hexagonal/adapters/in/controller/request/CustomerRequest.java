package com.jnsdev.hexagonal.adapters.in.controller.request;

import com.jnsdev.hexagonal.adapters.out.repository.entity.AddressEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:45
 */
@Data
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;
}
