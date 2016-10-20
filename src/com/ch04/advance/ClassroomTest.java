package com.ch04.advance;

public class ClassroomTest
{
	public static void main(String[] args){
		Classroom classroom=new Classroom();
		Teacher teacher=new Teacher(1,"dubo",300.00,10,21);
		Student s1=new Student(1,"a",10);
		Student s2=new Student(2,"c",20);
		Student s3=new Student(3,"d",30);
		classroom.setTeacher(teacher);
		classroom.addStudent(s1);
		classroom.addStudent(s3);
		classroom.addStudent(s2);
		System.out.println(classroom.getStudentNum());

	}

}
//创建Classroom对象


//创建Teacher对象，并将Teacher分配到Classroom中


//创建3个Student对象，并将Student分配到Classroom中


//调用Classroom中的其它方法，测试方法的业务逻辑是否准确