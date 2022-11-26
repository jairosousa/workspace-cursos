package com.jnsdev.hexagonal.adapters.out.repository.entity;

import lombok.Data;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 21:25
 */
@Data
public class AddressEntity {

    private String street;

    private String city;

    private String state;
}
