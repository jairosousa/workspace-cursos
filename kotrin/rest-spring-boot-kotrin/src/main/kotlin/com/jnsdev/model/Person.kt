package com.jnsdev.model


/**
 * @Autor Jairo Nascimento
 * @Created 29/04/2022 - 09:32
 */
data class Person (
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = ""
)