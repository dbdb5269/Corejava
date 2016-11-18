package Mybatis.Mappers;

import Mybatis.pojo.Student;

import java.util.List;

/**
 * Created by dubo on 16/11/16.
 */
public interface StudentMapper {
    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    void insertStudent(Student student);
    void deleteStudent(Integer id);
    void updateStudent(Integer id,String str);
    void saveStudentAndAddress(Student student);
    Student findStudentByIdAndAddress(Integer id);
}
