package com.basket;

public class Orange extends Fruit{

	public Orange(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	public void juice ()
    {
    	System.out.println("Name :"+super.getName()+"\nColor :"+super.getColor());
    	System.out.println("Extracting Juice");
    }
	@Override
	public String taste()
	{
		return " Sour ";
	}

	@Override
	public String toString() {
		return "Orange [taste()=" + taste() + "] \n[" + super.toString() + "]";
	}
	
}
