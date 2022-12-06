package com.jnsdev.rest.webservices.restfullwebservices.versioning;

/**
 * @Autor Jairo Nascimento
 * @Created 06/12/2022 - 05:46
 */
public class PersonV1 {

    private String name;

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV1 [" +
                "name='" + name + '\'' +
                ']';
    }
}
