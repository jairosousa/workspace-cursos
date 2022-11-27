package com.jnsdev.hexagonal.adapters.in.controller.response;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 22:21
 */

public class AddressResponse {

    private String street;

    private String city;

    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
