package com.oops;

public class Employee {
	
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	Employee()
	{
		System.out.println("This is no-argument constructor");
	}

	Employee(int id,   String firstname, String lastname, int salary)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
				@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ "]";
	}

				public double AnnualSalary() {
					return this.salary*12;
				}
				public double raiseSalary(int percent) {
				
					return this.salary+(this.salary*percent/100);
	}
				public static void main(String[] args) {
					Employee emp=new Employee(45, "Raja" , "kumar" , 120000 );
					System.out.println(emp.AnnualSalary());
					System.out.println(emp.raiseSalary(5));
					System.out.println(emp);
					
	
}  
}
