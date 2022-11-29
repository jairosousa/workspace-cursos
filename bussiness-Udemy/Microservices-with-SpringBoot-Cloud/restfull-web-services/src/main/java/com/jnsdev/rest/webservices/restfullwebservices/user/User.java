package com.jnsdev.rest.webservices.restfullwebservices.user;

import java.time.LocalDate;

/**
 * @Autor Jairo Nascimento
 * @Created 29/11/2022 - 15:28
 */
public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User [" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", birthDate= " + birthDate +
                ']';
    }
}
