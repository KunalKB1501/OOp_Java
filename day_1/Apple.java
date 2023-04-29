package com.basket;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	@Override
	public String taste()
	{
		return " Sweet and sour ";
	}
	
	 public void jam ()
	    {
	    	System.out.println("Name :"+super.getName()+"\nColor :"+super.getColor());
	    	System.out.println("Extracting Jam");
	    }

	@Override
	public String toString() {
		return "Apple [taste()=" + taste() + ", toString()=" + super.toString() + "]";
	}
	 


}
