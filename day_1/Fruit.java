package com.basket;

public abstract class Fruit {
	private String name,color;
	private double weight;
	private boolean stale=false;

	
	public Fruit(String name, String color, double weight) {

		this.name = name;
		this.color = color;
		this.weight = weight;
	}
   
	public boolean isStale() {
		return stale;
	}

	public void setStale(boolean stale) {
		this.stale = stale;
	}

	public String taste()
	{
		return "no Specific taste ";
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	
	
	
	

}
