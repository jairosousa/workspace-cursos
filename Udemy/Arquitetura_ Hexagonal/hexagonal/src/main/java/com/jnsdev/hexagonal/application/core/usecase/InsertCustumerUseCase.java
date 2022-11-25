package com.jnsdev.hexagonal.application.core.usecase;

import com.jnsdev.hexagonal.application.core.domain.Custumer;
import com.jnsdev.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.jnsdev.hexagonal.application.ports.out.InsertCustumerOutputPort;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:05
 */
public class InsertCustumerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustumerOutputPort insertCustumerOutputPort;

    public InsertCustumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustumerOutputPort insertCustumerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustumerOutputPort = insertCustumerOutputPort;
    }

    public void insert(Custumer custumer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustumerOutputPort.insert(custumer);
    }
}
