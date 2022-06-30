package com.student.management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentApp {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Student> slist=new ArrayList<Student>();
    
    StudentApp()
    {
        
        slist.add(new Student(101,"Aman","Mumbai",1,"V",987656453));
        slist.add(new Student(102,"Bhuban","Pune",2,"V",990656453));
        slist.add(new Student(103,"Kunal","Nagpur",3,"V",987600453));
        slist.add(new Student(104,"Rahul","Thane",4,"V",876556453));
        slist.add(new Student(105,"Rani","Delhi",6,"V",564534453));
        slist.add(new Student(106,"Kusum","Noida",7,"V",987656756));
        slist.add(new Student(107,"Mohini","Patna",8,"V",987654553));
        slist.add(new Student(108,"Namita","Chennai",9,"V",55556453));
        slist.add(new Student(109,"Krishna","Chennai",10,"V",987654553));       
    }
    
    
    public void updateStudentInfo() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        
        
        
        int flag=0;
        for(Student s:slist)
        {
            if(studentId==s.getStudentId())
            {
              flag=1;   
              int index=slist.indexOf(s);
               System.out.println("Enter Student Name:");
                String studentName=br.readLine();
                
                System.out.println("Enter Student Address:");
                String studentAddress=br.readLine();
                
                System.out.println("Enter Student RollNo:");
                int studentRoll=Integer.parseInt(br.readLine());
                
                System.out.println("Enter Student Class:");
                String studentClass=br.readLine();
                
                System.out.println("Enter Student Contact Number:");
                int studentContact=Integer.parseInt(br.readLine());
              s.setStudentName(studentName);
              s.setStudentAddress(studentAddress);
              s.setStudentRoll(studentRoll);
              s.setContactNo(studentContact);
              s.setStudentClass(studentClass);
              slist.set(index, s);
            }
        }
        
        if(flag==1)
            System.out.println("Student record updated!!");
        else
            System.out.println("Student Id does not exist!!");
    }
    
    
    public void deteteStudentInfoByStudentId() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        int flag=0,index;
        Student st=new Student();
        for(Student s:slist)
        {
            if(studentId==s.getStudentId())
            {
            flag=1;
            st=s;       
            }
        }
                
        if(flag==0)
        {
            System.out.println("Student id does not exist!!");
        }
        else
        {
           slist.remove(st);
           System.out.println("Student information deleted Succesfully!!");
         }
    }
    
    
    public void viewStudentInfo() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        int flag=0;
        for(Student student:slist)
        {
            if(studentId==student.getStudentId())
            {
            flag=1; 
            System.out.println("===============================================================");
            System.out.print("Name:"+student.getStudentName()+"\t"+"Address:"+student.getStudentAddress()+"\t"+"Roll:"+student.getStudentRoll()+"\t"+"Class:"+student.getStudentClass()+"\t"+student.getContactNo()+"\n");
            System.out.println("===============================================================");
            }
        }
        
        if(flag==0)
        {
            System.out.println("Student record does not exist!!");
        }
        
        
    }
    
    
    public void insertStudentInfo() throws NumberFormatException, IOException
    {
        System.out.println("Enter Student Id:");
        int studentId=Integer.parseInt(br.readLine());
        
        System.out.println("Enter Student Name:");
        String studentName=br.readLine();
        
        System.out.println("Enter Student Address:");
        String studentAddress=br.readLine();
        
        System.out.println("Enter Student RollNo:");
        int studentRoll=Integer.parseInt(br.readLine());
        
        System.out.println("Enter Student Class:");
        String studentClass=br.readLine();
        
        System.out.println("Enter Student Contact Number:");
        int studentContact=Integer.parseInt(br.readLine());
        
        Student student=new Student(studentId,studentName,studentAddress,studentRoll,studentClass,studentContact);
        
        slist.add(student);
        System.out.println("===============================================================");

        
    }
    
    
    public void viewAllStudentInfo()
    {
        if(slist.size()>0)
        {
        
        for(Student student:slist)
        {
            System.out.println("===============================================================");
            System.out.print("Name:"+student.getStudentName()+"\t"+"Address:"+student.getStudentAddress()+"\t"+"Roll:"+student.getStudentRoll()+"\t"+"Class:"+student.getStudentClass()+"\t"+student.getContactNo()+"\n");
            System.out.println("===============================================================");
        }
        }
        else
        {
            System.out.println("===============================================================");
            System.out.println("No record found!!");
            System.out.println("===============================================================");
        }
    }
    
    
    
    
    
    
    public void removeAllStudentInnfo()
    {
        slist.clear();
    }
    
    

    public static void main(String[] args) throws NumberFormatException, IOException {
        StudentApp app=new StudentApp();
        
        System.out.println("===============================================================");
        System.out.println("_______________ Student Management System _____________________");
        System.out.println("===============================================================");
        String c=null;
        do
        {
        System.out.println("\t\t 1)Insert new Student data.\r\n"
                + "\t\t 2)View Student Data.(student Id)\r\n"
                + "\t\t 3)Delete student Data.(student Id)\r\n"
                + "\t\t 4)Update Student Data.(student Id)\r\n"
                + "\t\t 5)View all Student Data.\r\n"
                + "\t\t 6)Detete all Student Data.");
        System.out.println("===============================================================");
        System.out.println("Enter Your Choice:");
        int choice=Integer.parseInt(br.readLine());
        System.out.println("===============================================================");
    
        
        switch(choice)
        {
          case 1: app.insertStudentInfo(); 
                System.out.println("Student information inserted Successfully!!");
                break;
          case 2:app.viewStudentInfo();
                break;
          case 3:app.deteteStudentInfoByStudentId();
                break;
          case 4:app.updateStudentInfo();
                break;
          case 5:System.out.println("View all Student Information:");               
                app.viewAllStudentInfo();
                break;
          case 6:app.removeAllStudentInnfo();
                 System.out.println("All records are deleted!!");
                 break;
          default:System.out.println("Wrong Choice!!");
                break;
        
        }
        
        System.out.println("Do you want to continue?(Y->Yes / N->No)");
        c=br.readLine();
    
        
        }while(c.equals("Y")|| c.equals("y"));
        
       
    }

}
