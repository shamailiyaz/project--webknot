package com.ta.upms.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curd")
public class Userdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private int mobilenumber;
	@Column
	private String place;

	public Userdata() {

	}

	public Userdata(String firstname, String lastname, String email, int mobilenumber, String place) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.place = place;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
