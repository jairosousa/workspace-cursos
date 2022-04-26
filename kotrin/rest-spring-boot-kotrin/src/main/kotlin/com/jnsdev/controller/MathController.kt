package com.jnsdev.controller

import com.jnsdev.converters.NumberConvert
import com.jnsdev.exception.UnsupportedMathOperationException
import com.jnsdev.math.SimpleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Autor Jairo Nascimento
 * @Created 25/04/2022 - 11:47
 */
@RestController
class MathController {

    private val math: SimpleMath = SimpleMath()

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return math.sum(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/subtration/{numberOne}/{numberTwo}"])
    fun subtration(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return math.subtration(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return math.multiplication(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return math.division(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["/mean/{numberOne}/{numberTwo}"])
    fun mean(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!NumberConvert.isNumeric(numberOne) || !NumberConvert.isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return math.mean(NumberConvert.convertToDouble(numberOne),NumberConvert.convertToDouble(numberTwo))
    }

  @RequestMapping(value = ["/squareRoot/{number}"])
    fun squareRoot(
        @PathVariable(value = "number") number: String?): Double {
        if (!NumberConvert.isNumeric(number))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return math.squareRoot(NumberConvert.convertToDouble(number))
    }
}

