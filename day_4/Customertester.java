package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.customer.*;
import static com.app.customer.Validation.*;
import utility.Customer;

@SuppressWarnings("unused")
public class Customertester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//			Supply Options
//			1. Sign up
//			2. Sign in
//			3. Change password
//			4. Un subscribe customer
//			5. Display all customers.
			// initialize start phase
			ArrayList<Customer> customerlist = new ArrayList<>();
			boolean exit = false;
			System.out.println("Show Plan Details");
			for (Serviceplan s : Serviceplan.values()) {
				System.out.println(s);
			}
			System.out.println(
					"1.sign up \n 2.sign in \n3.Display all customers\n4.change" + "\n 5.unsubscribe customer");

			while (!exit) {
				// Show plan Details
				try {
					System.out.println("enter your choice");
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"enter  1.Firstname 2.lastname 3.email \n4.password  5.Service Plan  6.Enter Date of Birth\r\n"
										+ "7.Registration amount ");
						Customer cust = validateall(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), customerlist);
						customerlist.add(cust);
						System.out.println("customer is addded");
						break;
					case 2:
						//sign in
						System.out.println("enter email and password");
						login(sc.next(), sc.next(), customerlist);
						break;
					case 3:
						//change password
						System.out.println("enter the  your email");
						String s=sc.next();
						System.out.println("enter new password");
						String nwp=sc.next();
						for(Customer c:customerlist)
						{
							if(c.equals(s))
								c.setPassword(nwp);
							
						}
						break;
					case 5:
						//show all customer details
						for (Customer c:customerlist)
							System.out.println(c);
						break;
					case 0:
						exit=true;
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
	}
}