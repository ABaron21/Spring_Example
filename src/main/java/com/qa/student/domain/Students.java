package com.qa.student.domain;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Students {

	private Long Id;
	private String name;
	private int age;
	private String phoneNumber;

	public Students() {
		super();
	}

	public Students(Long id, String name, int age, String phoneNumber) {
		super();
		Id = id;
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
	public int hashCode() {
		return Objects.hash(Id, age, name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(Id, other.Id) && age == other.age && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}

	@Override
	public String toString() {
		return "Students [Id=" + Id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}
