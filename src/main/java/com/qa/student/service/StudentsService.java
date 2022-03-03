package com.qa.student.service;

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

}
