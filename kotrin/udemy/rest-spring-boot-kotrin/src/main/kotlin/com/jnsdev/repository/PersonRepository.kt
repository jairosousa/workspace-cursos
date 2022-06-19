package com.jnsdev.repository

import com.jnsdev.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


/**
 * @Autor Jairo Nascimento
 * @Created 29/04/2022 - 11:36
 */
@Repository
interface PersonRepository : JpaRepository<Person, Long?> {
}