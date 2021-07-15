package com.interview.com.clientInterview.model;

public class Employe {

	private String name;
    private int age;
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
	public Employe(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Employe() {
		super();
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + "]";
	}
	
}
