package com.qa.student.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}
