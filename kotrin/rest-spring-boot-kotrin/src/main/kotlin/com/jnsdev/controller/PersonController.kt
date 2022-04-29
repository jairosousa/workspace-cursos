package com.jnsdev.controller

import com.jnsdev.converters.NumberConvert
import com.jnsdev.exception.UnsupportedMathOperationException
import com.jnsdev.math.SimpleMath
import com.jnsdev.model.Person
import com.jnsdev.services.PersonServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * @Autor Jairo Nascimento
 * @Created 25/04/2022 - 11:47
 */
@RestController
@RequestMapping("/person")
class PersonController {

    @Autowired
    private lateinit var service: PersonServices

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET],
    produces = [MediaType.APPLICATION_JSON_VALUE])
    fun sum(
        @PathVariable(value = "id") id: Long): Person {
        return service.findById(id)
    }

}

