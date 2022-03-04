package com.qa.student.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.student.domain.Students;
import com.qa.student.service.StudentsService;

@RestController
public class StudentsController {

	private StudentsService service;

	public StudentsController(StudentsService service) {
		super();
		this.service = service;
	}

	// create - post request
	@PostMapping("/create")
	public Students createMap(@RequestBody Students info) {
		return this.service.createNew(info);
	}

	// ReadAll - get request
	@GetMapping("/readAll")
	public List<Students> readMap() {
		return this.service.readAll();
	}

	// Read By Id
	@GetMapping("/readId/{id}")
	public Students readById(@PathVariable Long id) {
		return this.service.readId(id);
	}

	// Read By Age
	@GetMapping("/readAge/{age}")
	public List<Students> readByAge(@PathVariable int age) {
		return this.service.readByAge(age);
	}

	// Update - put request
	@PutMapping("/update/{id}")
	public Students updateMap(@PathVariable Long id, @RequestBody Students info) {
		return this.service.updateInfo(id, info);
	}

	// Delete
	@DeleteMapping("/delete/{id}")
	public void deleteMap(@PathVariable Long id) {
		this.service.delete(id);
	}
}
