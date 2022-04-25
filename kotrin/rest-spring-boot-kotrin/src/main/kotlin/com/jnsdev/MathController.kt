package com.jnsdev

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


/**
 * @Autor Jairo Nascimento
 * @Created 25/04/2022 - 11:47
 */
@RestController
class MathController {
    
    val counter: AtomicLong = AtomicLong()

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        return 1.0
    }
}