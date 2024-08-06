package com.meenachinmay.Bookstore.domain

import jakarta.persistence.*

@Entity
@Table(name = "authors")
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long = 0,

    @Column(name = "name", nullable = false, length = 50)
    var name: String,

    @Column(name = "age", nullable = false, length = 50)
    var age: Int,

    @Column(name = "description", nullable = false, length = 255)
    var description: String,

    @Column(name = "image", nullable = true)
    var image: String
)