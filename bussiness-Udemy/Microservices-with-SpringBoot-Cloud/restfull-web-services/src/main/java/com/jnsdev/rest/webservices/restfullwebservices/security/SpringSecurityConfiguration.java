package com.jnsdev.rest.webservices.restfullwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * @Autor Jairo Nascimento
 * @Created 07/12/2022 - 08:46
 */
@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        http
                .httpBasic(withDefaults());
        http
                .csrf().disable();

        return http.build();

    }
}
