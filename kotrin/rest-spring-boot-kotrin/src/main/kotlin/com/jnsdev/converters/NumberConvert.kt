package com.jnsdev.converters


/**
 * @Autor Jairo Nascimento
 * @Created 26/04/2022 - 14:56
 */
object NumberConvert {

    fun convertToDouble(strNumber: String?): Double {
        if (strNumber.isNullOrBlank()) return 0.0;
        // BR 10,20 US 10.20
        var number = strNumber.replace(",".toRegex(), ".");

        return if (isNumeric(number)) number.toDouble() else 0.0;

    }

    fun isNumeric(strNumber: String?): Boolean {
        if (strNumber.isNullOrBlank()) return false;

        var number = strNumber.replace(",".toRegex(), ".");

        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}