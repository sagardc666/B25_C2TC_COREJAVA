package com.cg.um;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	private int id;
	private String name;
	private String type;
	private String passward;
	
	public User() {
		super();
	}

	public User(int id, String name, String type, String passward) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.passward = passward;
	}

	
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", passward=" + passward + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPassward()=" + getPassward()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	 
	
	
	
}
	
	 
	

	
	
	 
	