package com.jnsdev.hexagonal.adapters.in.controller.response;

import lombok.Data;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:21
 */
@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;
}
