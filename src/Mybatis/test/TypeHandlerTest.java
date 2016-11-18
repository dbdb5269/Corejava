package Mybatis.test;

import Mybatis.Mappers.StudentMapper;
import Mybatis.pojo.Address;
import Mybatis.pojo.Student;
import Mybatis.utils.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static Mybatis.utils.MyBatisSqlSessionFactory.getSqlSession;

/**
 * Created by dubo on 16/11/17.
 */
public class TypeHandlerTest {
    @Test
    public void saveStudentAndAddress(){
        SqlSession session = MyBatisSqlSessionFactory.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Address address=new Address("江苏","昆山","巴城");
        Student student=new Student(3,"abc","11",new Date(),address);
        mapper.saveStudentAndAddress(student);
        session.commit();
    }
    @Test
    public void findAllStudents(){

        try {

            StudentMapper mapper = getSqlSession(true).getMapper(StudentMapper.class);
            Student studentById = mapper.findStudentByIdAndAddress(3);
            System.out.println(studentById);
            System.out.println(studentById.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
