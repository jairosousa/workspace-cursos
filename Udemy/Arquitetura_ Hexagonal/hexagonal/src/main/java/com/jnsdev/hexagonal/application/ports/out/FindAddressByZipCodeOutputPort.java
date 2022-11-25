package com.jnsdev.hexagonal.application.ports.out;

import com.jnsdev.hexagonal.application.core.domain.Address;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:08
 */
public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
