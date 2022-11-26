package com.jnsdev.hexagonal.adapters.out.client.response;

import lombok.Data;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:59
 */
@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;
}
