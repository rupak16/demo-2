package com.example.demo.gettopic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {

	@Id
	private String id;
	private String name;
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
	public Topics() {
		
	}
	public Topics(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
