package com.ch04.advance;

public class Student 
{
	public int id;
	public String name;
	public int age;

	public void print(){
		System.out.println("------ Student ------");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public Student(){

	}
	public Student(int sId, String sName, int sAge){
		id = sId;
		name = sName;
		age = sAge;
	}
}
