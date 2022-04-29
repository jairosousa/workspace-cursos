package com.jnsdev.services

import com.jnsdev.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger


/**
 * @Autor Jairo Nascimento
 * @Created 29/04/2022 - 09:35
 */

@Service
class PersonServices {

    private val counter: AtomicLong = AtomicLong()

    private val logger = Logger.getLogger(PersonServices::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person!")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Jairo"
        person.lastName = "Nascimento"
        person.address = "Uberlândia - Minas Gerais - Brasil"
        person.gender = "Male"
        return person
    }
}