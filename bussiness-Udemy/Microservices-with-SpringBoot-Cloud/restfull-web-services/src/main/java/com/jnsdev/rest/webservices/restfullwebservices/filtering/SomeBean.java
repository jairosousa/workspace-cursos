package com.jnsdev.rest.webservices.restfullwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Autor Jairo Nascimento
 * @Created 06/12/2022 - 06:53
 */
@JsonIgnoreProperties({"field1", "field2"})
public class SomeBean {

    private String field1;

    //    @JsonIgnore
    private String field2;

    private String field3;

    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}
