package com.basket;

public class Mango extends Fruit {

	public Mango(String name, String color, double weight) {
		super(name, color, weight);
	}
	
	
	@Override
	public String taste()
	{
		return " Sweet ";
	}
    public void pulp ()
    {
    	System.out.println("Name :"+super.getName()+"\nColor :"+super.getColor());
    	System.out.println("Extracting pulp");
    }

	@Override
	public String toString() {
		return "Mango [taste()=" + taste() + "]\n[" + super.toString() + "]";
	}
	

}
