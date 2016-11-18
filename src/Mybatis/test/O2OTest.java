package Mybatis.test;

import Mybatis.Mappers.StudentMapper;
import Mybatis.o2o.O2OMapper;
import Mybatis.pojo.Husband;
import Mybatis.pojo.Student;
import Mybatis.pojo.Wife;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static Mybatis.utils.MyBatisSqlSessionFactory.getSqlSession;

/**
 * Created by dubo on 16/11/18.
 */
public class O2OTest {
    private O2OMapper mapper;
    private SqlSession session;
    @Before
    public void getSession(){
        session = getSqlSession();
        mapper = session.getMapper(O2OMapper.class);

    }
    @Test
    public void save(){

        Husband husband=new Husband("husband");
        Wife wife=new Wife("wife",husband);
        mapper.saveHus(husband);
        mapper.saveWife(wife);
    }
    @Test
    public void selectWifeById(){
        Wife wife = mapper.selectWifeById(4);
        System.out.println(wife);

    }
    @Test
    public void selectWifeAllByWifeId(){
        Wife wife=mapper.selectWifeAndHusByWifeId(4);
        System.out.println(wife);
    }
    @Test
    public void selectWifeAllByWifeId2(){
        Wife wife=mapper.selectWifeAndHusByWifeId2(4);
        System.out.println(wife);
    }
    @Test
    public void selectWifeAllByWifeId3(){
        Wife wife=mapper.selectWifeAndHusByWifeId3(4);
        System.out.println(wife);
    }
    @After
    public void close(){
        session.commit();
        session.close();
    }
}
