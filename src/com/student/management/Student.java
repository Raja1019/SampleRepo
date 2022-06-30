
package com.student.management;

public class Student {
    
    private int studentId;//Camel casing
    private String studentName;
    private String studentAddress;
    private int studentRoll;
    private String studentClass;
    private long contactNo;
    
    
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Student(int studentId, String studentName, String studentAddress, int studentRoll, String studentClass,
            long contactNo) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentRoll = studentRoll;
        this.studentClass = studentClass;
        this.contactNo = contactNo;
    }


    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentAddress() {
        return studentAddress;
    }


    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }


    public int getStudentRoll() {
        return studentRoll;
    }


    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }


    public String getStudentClass() {
        return studentClass;
    }


    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }


    public long getContactNo() {
        return contactNo;
    }


    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }


    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + ", studentRoll=" + studentRoll + ", studentClass=" + studentClass + ", contactNo=" + contactNo + "]";
    }
    
    
    
    
    
    

}

