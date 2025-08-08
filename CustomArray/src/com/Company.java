package com;

import java.util.Arrays;

public class Company {
	
	
	String name;
	Employee [] employee;
	
	public Company(String name, Employee[] emp) {
		super();
		this.name=name;
		
		this.employee= emp;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		emp[0]=new Employee(1,"John", 30000);
		emp[1]=new Employee(2,"Ramesh", 20000);
		emp[2]=new Employee(1,"Vasu", 40000);
		
		Company c = new Company("Marco",emp);
		
		System.out.println(c);
	
		
		
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", employee=" + Arrays.toString(employee) + "]";
	}

}
