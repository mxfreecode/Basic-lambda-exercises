package com.school.app;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private int age;
	private Date dte;
	private String curse;
	public Student(int id, String name, int age, Date dte, String curse) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dte = dte;
		this.curse = curse;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDte() {
		return dte;
	}
	public void setDte(Date dte) {
		this.dte = dte;
	}
	public String getCurse() {
		return curse;
	}
	public void setCurse(String curse) {
		this.curse = curse;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dte=" + dte + ", curse=" + curse + "]";
	}
	
}
