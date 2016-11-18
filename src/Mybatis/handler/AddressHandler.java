package Mybatis.handler;

import Mybatis.pojo.Address;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dubo on 16/11/17.
 */
public class AddressHandler extends BaseTypeHandler<Address>{

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int index, Address address, JdbcType jdbcType) throws SQLException {
        System.out.println(".........");
        //Address String
        String pString=address.getProvice();
        String cString=address.getCity();
        String sString=address.getStreet();
        String value = pString + "-" + cString + "-" + sString;
        preparedStatement.setString(index,value);

    }

    @Override
    public Address getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s); //xx-xx-xx
        Address address=null;
        if (string!=null) {
            String[] split = string.split("-");
            address = new Address(split[0], split[1], split[2]);
        }

        return address;
    }

    @Override
    public Address getNullableResult(ResultSet resultSet, int index) throws SQLException {
        String string = resultSet.getString(index); //xx-xx-xx
        Address address=null;
        if (string!=null) {
            String[] split = string.split("-");
            address = new Address(split[0], split[1], split[2]);
        }

        return address;
    }

    @Override
    public Address getNullableResult(CallableStatement callableStatement, int index) throws SQLException {
        String string = callableStatement.getString(index); //xx-xx-xx
        Address address=null;
        if (string!=null) {
            String[] split = string.split("-");
            address = new Address(split[0], split[1], split[2]);
        }

        return address;
    }
}
