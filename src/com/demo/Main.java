package com.demo;

    class Member {
	private String name;
	private int age;
	private long phoneNumber;
	private String Address;
	private double Salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Member(String name, int age ,long phoneNumber, String Address, double Salary)
	{
		this.name = name;
		this.age = age;
		this.phoneNumber =phoneNumber;
		this.Address = Address;
		this.Salary = Salary;
	
	}
	public void printSalary() {
		System.out.println("Salary " + Salary);
	}
}
 class Employee extends Member {
	private String specilization;
	
	
	
	public String getSpecilization() {
		return specilization;
	}



	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}



	public Employee( String name , int age, long phoneNumber , String Address, double Salary, String specilization)
	{
		super(name,age,phoneNumber,Address,Salary);
		this.specilization = specilization;
	}
}
 
 class Manager extends Member{
	private String department;
	
	
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Manager( String name , int age, long phoneNumber , String Address, double Salary, String department)
	{
		super(name,age,phoneNumber,Address,Salary);
		this.department = department;
	}
	
}
 
  class Main{
	 public static void main(String[] args) {
		 Employee employee = new Employee("virat" , 32 , 987463215 , "home" , 25648.56 , "ece");
		 Manager manager = new Manager("Rohini" , 22 , 987463215 ,"kanpur" , 87458.56 , "cs" );
		 employee.printSalary();
		 manager.printSalary();
		 System.out.println(employee.getName() + " " + employee.getAge()  );
	 }
 }
