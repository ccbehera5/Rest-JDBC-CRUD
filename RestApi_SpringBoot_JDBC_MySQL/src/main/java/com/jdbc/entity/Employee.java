package com.jdbc.entity;


public class Employee {
	
	private Long id;
	
	private String name;
	
	private String location;
	
	private String department;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(Long id, String name, String location, String department) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.department = department;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	
}
//https://bushansirgur.in/spring-boot-jdbctemplate-crud-operations-mysql/
