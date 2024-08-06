package com.meenachinmay.Bookstore.domain

import jakarta.persistence.*

@Entity
@Table(name = "books")
data class Book(
    @Id
    @Column(name = "isbn")
    var isbn: Long,

    @Column(name = "title")
    var title: String,

    @Column(name = "description")
    var description: String,

   @Column(name = "image")
    var image: String,

    @ManyToOne(cascade = [(CascadeType.DETACH)])
    @JoinColumn(name = "author")
    var author: Author,
)