package com.qa.oop;

public class EncupPerson {
	private String name;
	private int age;
	private String jobtitle;

	public EncupPerson(String name, int age, String jobtitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;
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

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	@Override
	public String toString() {
		return "EncupPerson [name=" + name + ", age=" + age + ", jobtitle=" + jobtitle + "]";
	}

}
