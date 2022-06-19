package com.jnsdev.model

import jakarta.persistence.*


/**
 * @Autor Jairo Nascimento
 * @Created 29/04/2022 - 09:32
 */
@Entity
@Table(name = "person_table")
data class Person (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String = "",

    @Column(name = "last_name", nullable = false, length = 80)
    var lastName: String = "",

    @Column(nullable = false, length = 100)
    var address: String = "",

    @Column(nullable = false)
    var gender: String = ""
)