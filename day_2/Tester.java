package p2;

import java.util.Scanner;


import static p1.Check_speed.*;


public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//check speed range 
		try
		{
			System.out.println("Enter the speed :");
			speedRange(sc.nextInt());	
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		//check license
		try(Scanner sc1=new Scanner(System.in))
		{
			System.out.println("Enter the Expire date 'yyyy-MM-dd':");
			System.out.println(expdate(sc1.next()));
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		//close the Open source in finally method if you have not used try with resource method
		finally
		{
			System.out.println("you can go now");
			sc.close();
		}
	}

}
