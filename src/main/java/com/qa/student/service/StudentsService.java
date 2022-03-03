package com.qa.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.student.domain.Students;
import com.qa.student.repo.StudentsRepo;

@Service
public class StudentsService {

	private StudentsRepo repo;

	public StudentsService(StudentsRepo repo) {
		super();
		this.repo = repo;
	}

	// create
	public Students createNew(Students info) {
		return this.repo.save(info);
	}

	// ReadAll
	public List<Students> readAll() {
		return this.repo.findAll();
	}
}
