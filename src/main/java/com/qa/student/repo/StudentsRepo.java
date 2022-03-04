package com.qa.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.student.domain.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long> {

	List<Students> findByAge(int age);

}
