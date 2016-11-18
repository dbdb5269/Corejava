package Mybatis.o2o;

import Mybatis.pojo.Husband;
import Mybatis.pojo.Wife;

import java.util.List;

/**
 * Created by dubo on 16/11/18.
 */
public interface O2OMapper {
    void saveHus(Husband husband);
    void saveWife(Wife wife);
    Wife selectWifeById(int id);
    List<Wife> selectAllWife();
    Wife selectWifeAndHusByWifeId(int id);
    Wife selectWifeAndHusByWifeId2(int id);
    Wife selectWifeAndHusByWifeId3(int id);
}
