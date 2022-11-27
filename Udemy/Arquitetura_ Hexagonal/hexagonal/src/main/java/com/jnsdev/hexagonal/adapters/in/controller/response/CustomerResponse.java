package com.jnsdev.hexagonal.adapters.in.controller.response;


/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:17
 */
public class CustomerResponse {

    private String name;

    private AddressResponse address;

    private String cpf;

    private Boolean isValidCpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressResponse getAddress() {
        return address;
    }

    public void setAddress(AddressResponse address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getIsValidCpf() {
        return isValidCpf;
    }

    public void setIsValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
