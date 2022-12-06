package com.jnsdev.rest.webservices.restfullwebservices.versioning;

/**
 * @Autor Jairo Nascimento
 * @Created 06/12/2022 - 05:46
 */
public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV2 [" +
                "name=" + name +
                ']';
    }
}
