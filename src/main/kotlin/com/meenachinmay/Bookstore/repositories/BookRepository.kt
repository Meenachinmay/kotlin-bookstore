package com.meenachinmay.Bookstore.repositories

import com.meenachinmay.Bookstore.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<Book, String> {
}