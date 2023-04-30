package p1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Check_speed {
	//declare range of speed
	//make them final so they won't change until required
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	//declare date format
	public static SimpleDateFormat sdf;
	
	//declare them in static block so they need to be load once
	static
	{
		MIN_SPEED=50;
		MAX_SPEED=90;
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}
	
	//create a static method so we can access it directly without instance
	public static void speedRange(int speed) throws Speedexception//delegate
	{
		//check condition and throw exception 
		if(speed<MIN_SPEED)
			throw new Speedexception("Too slow! \nnPlease drive fast");
		if(speed>MAX_SPEED)
			throw new Speedexception("Too fast! \nPlease drive slowly");
		System.out.println("Speed is within range");
	}
	
	//include date exp date method
	public static Date expdate(String expdate) throws ParseException,License_expiry
	{
		//convert date using parse
		//sdf
		Date lcdate=sdf.parse(expdate);
		//parsing process succesful 
		//add current date
		Date today =new Date();
		//current format Date();
		//check condition whether license is expire or not
		//using date class method
		if(lcdate.after(today))
		return lcdate;
		//throw exception
	throw new License_expiry("License is expire");
	
	
	}

	
	
}
