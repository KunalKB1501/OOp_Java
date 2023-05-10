package validation;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import com.app.emp.Department;
import com.app.emp.Employee;

import exception.CustomException;

public interface Validate {
	
	 static LocalDate validate(String date) throws CustomException
	 {
		 LocalDate d2=LocalDate.parse(date);
		 //parsing succesful
		 int d1 = Period.between(d2,LocalDate.now()).getYears();
		 if(d1>3)
			 throw new CustomException("invalid Date");
		return d2;
		 
	 }
	 static Department validatedepartment(String dept)
	 {
		return Department.valueOf(dept.toUpperCase());
		 
	 }
	 static String validatekey(String key,HashMap<String,Employee>map) throws CustomException
	 {
		 
		 if(map.containsKey(key))
			 throw new CustomException("Duplicate Id");
		return key;
		 
	 }
	 
	 static <empid> Employee validateallinputs(String empid, String firstname, String lastname, double salary, String joiningdate,
				String dept,HashMap<String, Employee> map) throws CustomException
	 {
		 Department validatedepartment = validatedepartment(dept);
		 LocalDate validate = validate(joiningdate);
		String key= validatekey(empid,map);
		return new Employee(key, firstname, lastname, salary, validate, validatedepartment); 
		 
	 }
	// static Employee promotion(String empid,string dept,)

}
