package com.app.customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import exception.CustomerException;
import utility.Customer;

public class Validation {

	//no duplicate customer
	//reg amount mustmatch with plan 
	//validate service plan
	//customer must be adult (21)
	
	public static Serviceplan validateplan(String s,double amount) throws CustomerException
	{
		Serviceplan src=Serviceplan.valueOf(s.toUpperCase());
		if(src.getPlancost()!=amount)
			throw new CustomerException("Please select proper Plan and pay");
		return src; 
	}
	
	public static void checkdupemail(List<Customer>Customerlist,String email) throws CustomerException
	{
		//wrap email in customer
		Customer newcst=new Customer(email);
		if(Customerlist.contains(newcst))
		throw new CustomerException("Duplicate email found");
		System.out.println("no Duplicate Email found");	
	}
	
	public static LocalDate ValidateAge(String dob) throws CustomerException
	{
	 //System.out.println("Enter your Birth Date in yyyy-mm-dd");
	 LocalDate birthdate=LocalDate.parse(dob);
	 int age=Period.between(birthdate, LocalDate.now()).getYears();
	 if(age<21)
		 throw new CustomerException("Customer is not Adult");
	 return birthdate;
	 }
	
	public static Customer validateall(String name, String lastname, String email, String password, String splan,String dob,
			double regamount,List<Customer>Customerlist) throws CustomerException
	{
		checkdupemail(Customerlist,email);
		Serviceplan plan=validateplan(splan,regamount);
		LocalDate birthdate=ValidateAge(dob);
		return new Customer(name, lastname, email, password, plan, birthdate, regamount);
		
	}
	
	
	public static void login(String email,String paasword,List<Customer>Customerlist) throws CustomerException
	{
		//for checking sign details add parametrised ctor for email,password 
	Customer sn=new Customer(email, paasword);
		if(Customerlist.contains(sn)) {
		System.out.println("Log in successfully");
		return ;
		}
		throw new CustomerException("invalid email  or password");

	}

	
	
}
