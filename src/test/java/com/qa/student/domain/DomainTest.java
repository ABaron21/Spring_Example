package com.qa.student.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class DomainTest {

	public Students student;

	@Test
	public void GettersAndSettersTest() {
		Students testStudent = new Students(1L, "Alex", 21, "07428055455");

		assertNotNull(testStudent.getId());
		assertNotNull(testStudent.getName());
		assertNotNull(testStudent.getAge());
		assertNotNull(testStudent.getPhoneNumber());

		testStudent.setId(null);
		assertNull(testStudent.getId());
		testStudent.setName(null);
		assertNull(testStudent.getName());
		testStudent.setAge(0);
		assertNotNull(testStudent.getAge());
		testStudent.setPhoneNumber(null);
		assertNull(testStudent.getPhoneNumber());
	}

	@Test
	void toStringTest() {
		Students testStudent = new Students(1L, "Alex", 21, "07428055455");
		String toString = "Students [Id=1 , name=Alex , age=21 , phoneNumber=07428055455]";
		assertNotNull(toString, testStudent.toString());
	}

	@Test
	void emptyConstructor() {
		Students testStudent = new Students();
		assertNull(testStudent.getId());
		assertNull(testStudent.getName());
		assertNotNull(testStudent.getAge());
		assertNull(testStudent.getPhoneNumber());
	}

	@Test
	void constructorWithoutId() {
		Students testStudent = new Students("Alex", 21, "07428055455");
		assertNull(testStudent.getId());
		assertNotNull(testStudent.getName());
		assertNotNull(testStudent.getAge());
		assertNotNull(testStudent.getPhoneNumber());
	}
}
