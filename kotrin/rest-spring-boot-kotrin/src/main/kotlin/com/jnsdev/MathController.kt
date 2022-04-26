package com.jnsdev

import com.jnsdev.exception.UnsupportedMathOperationException
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Autor Jairo Nascimento
 * @Created 25/04/2022 - 11:47
 */
@RestController
class MathController {

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?
    ): Double {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw UnsupportedMathOperationException("Please set a numeric value!")
        return convertToDouble(numberOne) + convertToDouble(numberTwo)
    }

    private fun convertToDouble(strNumber: String?): Double {
        if (strNumber.isNullOrBlank()) return 0.0;
        // BR 10,20 US 10.20
        var number = strNumber.replace(",".toRegex(), ".");

        return if (isNumeric(number)) number.toDouble() else 0.0;

    }

    private fun isNumeric(strNumber: String?): Boolean {
        if (strNumber.isNullOrBlank()) return false;

        var number = strNumber.replace(",".toRegex(), ".");

        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}

