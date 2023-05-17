package com.example.lib.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="librarians")
public class Librarian {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column()
	private long id;
	private String name;
	private String address;
	private String emailId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Librarian(long id, String name, String address, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
	}
	public Librarian() {
		
	}

}

