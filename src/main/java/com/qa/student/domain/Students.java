package com.qa.student.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {

	@Id // mark it as the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Long Id;

	private String name;
	private int age;
	private String phoneNumber;

	public Students() {
		super();
	}

	public Students(Long id, String name, int age, String phoneNumber) {
		super();
		this.Id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Students(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Students [Id=" + Id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}
