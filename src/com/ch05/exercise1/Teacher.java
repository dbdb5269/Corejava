package com.ch05.exercise1;


public class Teacher
{
	public String name;		//姓名
	public int age;			//年龄
	public double salary;	//薪水
	public Teacher(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	//用于年龄增加的方法
	public void increaseAge(){
		age++;
	}
}
