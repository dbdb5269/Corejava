package euqal;

class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object o){
		Person p = (Person)o;
		return name.equals(p.name) && age == p.age;
	}
	public String toString(){
		return name + " " + age;
	}
}
public class EqualsTest{
	public static void main(String[] args){
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1==s2:" + (s1==s2));
		System.out.println("s1.equals(s2):" + s1.equals(s2));
		String s3 = "hello";
		String s4 = "hello";
		System.out.println("s3==s4:" + (s3==s4));
		Person p1 = new Person("Jack",20);
		Person p2 = new Person("Jack",20);
		System.out.println("p1==p2:" + (p1==p2));
		System.out.println("p1.equals(p2):" + p1.equals(p2));
		System.out.println("p1:" + p1);
	}
}
