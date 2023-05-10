package com.app.emp;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	private String empid, firstname, lastname;
	private double salary;
	private LocalDate joiningdate;
	private Department dept;

	public Employee(String empid, String firstname, String lastname, double salary, LocalDate joiningdate,
			Department dept) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.joiningdate = joiningdate;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", joiningdate=" + joiningdate + ", dept=" + dept + "]";
	}

	public LocalDate getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getEmpid() {
		return empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(String empid) {
		super();
		this.empid = empid;
	}
	

}
