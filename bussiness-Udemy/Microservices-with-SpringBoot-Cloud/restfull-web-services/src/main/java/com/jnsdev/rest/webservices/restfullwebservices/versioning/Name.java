package com.jnsdev.rest.webservices.restfullwebservices.versioning;

/**
 * @Autor Jairo Nascimento
 * @Created 06/12/2022 - 05:51
 */
public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ']';
    }
}
