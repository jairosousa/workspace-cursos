package com.jnsdev.rest.webservices.restfullwebservices.jpa;

import com.jnsdev.rest.webservices.restfullwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Autor Jairo Nascimento
 * @Created 07/12/2022 - 06:06
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
}
