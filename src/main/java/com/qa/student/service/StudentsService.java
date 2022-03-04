package com.qa.student.service;

import java.util.List;
import java.util.Optional;

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

	// Read By Id
	public Students readId(Long id) {
		Optional<Students> optionalStudent = this.repo.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		}
		return null;
	}

	// Update
	public Students updateInfo(Long id, Students newInfo) {
		Students oldInfo = this.repo.getById(id);
		oldInfo.setName(newInfo.getName());
		oldInfo.setAge(newInfo.getAge());
		oldInfo.setPhoneNumber(newInfo.getPhoneNumber());
		return this.repo.save(oldInfo);
	}

	// Delete
	public void delete(Long id) {
		this.repo.deleteById(id);
	}
}
