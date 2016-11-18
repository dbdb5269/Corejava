package Mybatis.test;

import Mybatis.Mappers.StudentMapper;
import Mybatis.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static Mybatis.utils.MyBatisSqlSessionFactory.getSqlSession;

/**
 * Created by dubo on 16/11/16.
 */
public class StudentMapperTest {


//    @Test
    public void insertStudent(){
        try {

            StudentMapper mapper = getSqlSession(true).getMapper(StudentMapper.class);
            mapper.insertStudent(new Student(2,"dubo","1@qq.com",new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteStudent(Integer id){
        try {
            StudentMapper mapper = getSqlSession(true).getMapper(StudentMapper.class);
            mapper.deleteStudent(id);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void updateStudent(Integer id,String s){
        try {
            StudentMapper mapper = getSqlSession(true).getMapper(StudentMapper.class);
            mapper.updateStudent(id,s);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Student findStudentById(Integer id){
        Student studentById=null;
        try {

            StudentMapper mapper = getSqlSession(true).getMapper(StudentMapper.class);
            studentById = mapper.findStudentById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentById;
    }
    public List<Student> findAllStudents(){
        List<Student> list=null;
        try {

            StudentMapper mapper = getSqlSession(true).getMapper(StudentMapper.class);
            list = mapper.findAllStudents();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    @Test
    public void testFunctionfindStudentById(){

        System.out.println(findAllStudents());

    }

}
