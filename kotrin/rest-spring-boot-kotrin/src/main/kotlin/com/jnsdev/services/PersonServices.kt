package com.jnsdev.services

import com.jnsdev.exception.ResourceNotFoundException
import com.jnsdev.model.Person
import com.jnsdev.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.util.logging.Logger


/**
 * @Autor Jairo Nascimento
 * @Created 29/04/2022 - 09:35
 */

@Service
class PersonServices {

    @Autowired
    private lateinit var repository: PersonRepository

    private val logger = Logger.getLogger(PersonServices::class.java.name)

    fun findAll(): List<Person> {
        logger.info("Finding all people!")

        return repository.findAll()
    }

    fun findById(id: Long): Person {
        logger.info("Finding one person!")

        return repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID!") }
    }

    fun create(person: Person): Person {
        logger.info("Create one person with name ${person.firstName}")
        return repository.save(person)
    }

    fun update(person: Person): Person {
        logger.info("Updating one person with ID! ${person.id}")

        val entity = repository.findById(person.id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID!") }

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender

        return repository.save(entity)
    }

    fun delete(id: Long) {
        logger.info("Deleting one person with ID! $id")
        val entity = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID!") }

        repository.delete(entity)
    }

}