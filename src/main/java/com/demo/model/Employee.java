package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "contact")
	private long contact;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "desigation")
	private String designation;
	
	@Column(name = "salary")
	private long salary;
	
	
	public Employee() {
		
	}
	
	public Employee(long id,String firstName, String lastName,long contact,String address, String emailId,long salary,String designation) {
		super();
		this.id=id;
		this.address=address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact=contact;
		this.emailId = emailId;
		this.salary=salary;
		this.designation=designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
