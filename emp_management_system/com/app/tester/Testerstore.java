package com.app.tester;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static validation.Validate.*;

import com.app.emp.Department;
import com.app.emp.Employee;

import static utils.IOutls.*;

@SuppressWarnings("unused")
public class Testerstore {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		try (Scanner sc = new Scanner(System.in)) {
			//HashMap<String, Employee> maps = new HashMap<String, Employee>();
			boolean exit = false;
			// read file
				System.out.println("enter the file name ");
				String filename=sc.nextLine();
				HashMap<String, Employee> maps = restoreDetails(filename);
				System.out.println("restored map"+maps);

			while (!exit) {
				System.out.println("1. Hire new emp\r\n" + "2. List all emp details\r\n" + "3. Promote an emp\r\n"
						+ "4. Delete emp details\r\n" + "5. Sort emps as per join date n display the same.\r\n"
						+ "6. We can add many more options here.....\r\n" + "0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Hire new emp");
						System.out.println("enter employee Details ");
						System.out.println(" empid,  firstname,  lastname,  salary,  joiningdate, dept");
						Employee e1 = validateallinputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), maps);
						maps.put(e1.getEmpid(), e1);
						break;
					case 2:
						System.out.println("show all employee Details ");
						// using functional programming
						maps.forEach((k, v) -> System.out.println(v));
						// maps.values().forEach(v->System.out.println(v));
						break;
					case 3:
						//promote an employees salary from specific department 
					System.out.println("Enter the empid and update salary by 30 %");
					String empid=sc.next();
					//update salary
					maps.values().parallelStream().filter(s-> s.getEmpid().contains(empid)).forEach(s->s.setSalary(s.getSalary()*1.3));
						
					
						break;
					case 4:
						//remove an employee
						System.out.println("enter the empid");
						String key = sc.next();
						System.out.println("remove " + maps.remove(key)); 
						break;
					case 5:
						//Sort emps as per join date n display the same.
			Comparator <Employee> emp=(e,e2) ->(e
					.getJoiningdate().compareTo(e2.getJoiningdate()));
			maps.values().stream().sorted(emp).forEach(v -> System.out.println(v));
						break;
					case 6:
						System.out.println("Enter the Employee id ");
						String id=sc.next();
						System.out.println("enter the department you want to change");
						Department department1 = validatedepartment(sc.next());
					//	maps.values().stream().filter();
//						for(Employee e:maps.values())
//						{
//							if(id.equals(e.getEmpid())) {
//								e.setDept(department);
//							e.getDept();
//							}
//						}
					
						maps.values().stream().filter(s -> s.getEmpid().contains(id)).forEach(v ->v.setDept(department1));
						break;
					case 0:
						exit = true;
						//store emp details in a bin file
						System.out.println("enter the file name ");
						storeDetails( maps,filename);
						System.out.println("file stored");
						
						break;
					}

				} 
				catch (Exception e) {
					e.getStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
