package Mybatis.pojo;

import java.util.Date;

/**
 * Created by dubo on 16/11/16.
 */
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    private Address address;

    public Student(){
        super();
    }
    public Student(Integer studId,String name,String email,Date dob){
        super();
        this.studId=studId;
        this.name=name;
        this.email=email;
        this.dob=dob;

    }
    public Student(Integer studId,String name,String email,Date dob,Address address){
        super();
        this.studId=studId;
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.address=address;
    }
    public Date getDob() {
        return dob;
    }

    public Integer getStudId() {
        return studId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return "Student [studentId=  "+studId+"  studentName  "+name+"  studentEmail  "+email+"  dob"+dob+"  studentAddress  "+address;
    }
}
