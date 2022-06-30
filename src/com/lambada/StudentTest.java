package com.lambada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    
    long studentId;
    String studentName;
    int studentRoll;
    long studentMarks;
    
    public Student(long studentId, String studentName, int studentRoll, long studentMarks) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentRoll = studentRoll;
        this.studentMarks = studentMarks;
    }

    
    
    public long getStudentId() {
        return studentId;
    }



    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }



    public String getStudentName() {
        return studentName;
    }



    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public int getStudentRoll() {
        return studentRoll;
    }



    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }



    public long getStudentMarks() {
        return studentMarks;
    }



    public void setStudentMarks(long studentMarks) {
        this.studentMarks = studentMarks;
    }



    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRoll=" + studentRoll
                + ", studentMarks=" + studentMarks + "]";
    }
    
    
    
    
}

public class StudentTest {

    public static void main(String[] args) {
        
        ArrayList<Student> studentList=new ArrayList<Student>();
        
        studentList.add(new Student(100,"Raman",1,560));
        studentList.add(new Student(101,"Sonal",67,600));
        studentList.add(new Student(102,"Kavita",3,500));
        studentList.add(new Student(103,"Ranjan",4,530));
        studentList.add(new Student(104,"Rahul",5,590));
        studentList.add(new Student(105,"Mrinal",6,550));
        studentList.add(new Student(106,"Saurav",68,600));
        studentList.add(new Student(107,"Krishna",8,510));
        studentList.add(new Student(108,"Sidhu",9,588));
        studentList.add(new Student(109,"Anil",10,520));
        
        studentList.forEach(x->System.out.println(x));
        
    
    ArrayList<Student> sortedlist=(ArrayList<Student>) studentList
            .stream()
            .map(x->x)
            .sorted(Comparator.comparingLong(Student::getStudentMarks))
            .collect(Collectors.toList());
        
    System.out.println("Sorted list on marks....");
        sortedlist.forEach(x->System.out.println(x));
        
        
        ArrayList<Student> sortedlist1=(ArrayList<Student>) studentList
                .stream()
                .map(x->x)
                .sorted(Comparator.comparing(Student::getStudentId))
                .collect(Collectors.toList());
            
        System.out.println("Sorted list on marks....");
            sortedlist.forEach(x->System.out.println(x));
    }

}
