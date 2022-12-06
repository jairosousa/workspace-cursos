package com.jnsdev.rest.webservices.restfullwebservices.jpa;

import com.jnsdev.rest.webservices.restfullwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Autor Jairo Nascimento
 * @Created 06/12/2022 - 13:46
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
