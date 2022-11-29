package com.jnsdev.rest.webservices.restfullwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 29/11/2022 - 15:44
 */
@RestController
@RequestMapping("/users")
public class UserResource {

    private final UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/{id}")
    public User retrievelUser(@PathVariable int id) {
        return userDaoService.findOne(id);
    }
}
