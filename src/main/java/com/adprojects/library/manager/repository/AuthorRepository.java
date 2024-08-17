package com.adprojects.library.manager.repository;

import com.adprojects.library.manager.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // select * from author where email = ?
    Author findByEmail(String email);
}
