package com.jnsdev.hexagonal.adapters.out.client.response;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:59
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
