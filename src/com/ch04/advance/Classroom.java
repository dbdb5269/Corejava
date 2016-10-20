package com.ch04.advance;



public class Classroom
{
	public Teacher teacher;						//保存教师
	public Student[] students = new Student[40];//保存学生
	public int index = 0;						//保存学生数量

	public Teacher getTeacher(){
		//返回教室中的教师
		return teacher;
	}

	public Student[] getStudents(){

		return students;
		//返回所有的学生

	}

	public void setTeacher(Teacher tea){
		teacher=tea;
		//更换教师

	}

	public void addStudent(Student stu){
		students[index]=stu;
		index++;
		//增加学生

	}

	public boolean removeStudent(int idx){
		if(idx>index-1){
			return false;
		}
		else {
			for(int i=idx;i<index-1;i++){
				students[i]=students[i+1];
			}
			return true;
		}
		//删除学生

	}

	public int getStudentNum(){
		return index;
		//返回教室中学生的数量

	}

	public void print(){
		teacher.print();
		for(int i=0;i<index;i++){
			students[i].print();
		}
		//输出当前教室中的教师和学生的信息

	}
}
