package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Student {
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
	private int id;
	private String name;
	@Autowired
	public Subject subject;
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	//@Bean(scope=DefaultScopes.PROTOTYPE)
	public com.spring.test.ClassRoom classRoom() {
		return new ClassRoom();
	}

}
