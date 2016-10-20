package ch06.exercise2;
import java.util.*;
public class Person implements Comparable{
	private String name;
	private int age;
	private boolean gender;
	public int compareTo(Object o){
		if(o instanceof Person){
			Person p=(Person)o;
			return p.getAge()-this.getAge();
		}
		return -1;
	}
	public Person(){
		this.name="null";
		this.age=-1;
		this.gender=true;
	}
	public Person(String name,int age,boolean gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		if(age<0 || age>200){
			System.out.println("false");	
		}
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public void setGender(boolean gender){
		this.gender=gender;
	}
	public boolean getGender(){
		return this.gender;
	}
	public String toString(){
		return name+":"+age+":"+(gender ? "male":"female");	
	}
	
	public boolean equals(Object o){
		if(o instanceof Person){
			Person p=(Person)o;
			return (name.equals(p.getName())) && (age==p.getAge()) &&(gender==p.getGender());
		}
		return false;
	
	}
	
	public int hashCode(){
		return name.hashCode()+age+(gender?1:0);
	}

}







