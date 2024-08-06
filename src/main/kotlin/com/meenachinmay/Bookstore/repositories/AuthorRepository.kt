package com.meenachinmay.Bookstore.repositories

import com.meenachinmay.Bookstore.domain.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Long?> {
}