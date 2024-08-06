package com.meenachinmay.Bookstore.domain

import jakarta.persistence.*

@Entity
@Table(name = "books")
data class Book(
    @Id
    @Column(name = "isbn", nullable = false)
    var isbn: String,

    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name = "description", nullable = false)
    var description: String,

   @Column(name = "image", nullable = false)
    var image: String,

    @ManyToOne(cascade = [(CascadeType.DETACH)])
    @JoinColumn(name = "author_id")
    var author: Author,
)