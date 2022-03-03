package com.qa.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.student.domain.Students;

public interface StudentsRepo extends JpaRepository<Students, Long> {

}
