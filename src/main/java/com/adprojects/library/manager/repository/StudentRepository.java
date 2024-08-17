package com.adprojects.library.manager.repository;

import com.adprojects.library.manager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
