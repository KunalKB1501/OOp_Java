package com.app.customer;

public enum Serviceplan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	 private double plancost;

 private Serviceplan(double  plancost) {
	this.plancost=plancost;
}
 @Override
 public String toString()
 {
	 return "Name "+name()+"\nplancost :"+plancost;
 }
 public double getPlancost()
 {
	 return plancost;
 }
}
