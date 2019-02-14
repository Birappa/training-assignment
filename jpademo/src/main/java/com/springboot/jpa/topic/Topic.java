package com.springboot.jpa.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String descriptor;
	
	
	public Topic() {
		super();
	}


	public Topic(String id, String name, String descriptor) {
		super();
		this.id = id;
		this.name = name;
		this.descriptor = descriptor;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescriptor() {
		return descriptor;
	}


	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	
	
	
}
