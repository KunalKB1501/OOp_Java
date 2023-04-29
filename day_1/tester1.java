package com.app.tester;

import java.util.Scanner;

import static java.lang.System.exit;

import com.app.fruit.Apple;
import com.app.fruit.Fruit;
import com.app.fruit.Mango;
import com.app.fruit.Orange;

public class tester1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the capacity of basket");
		Fruit[] basket = new Fruit[sc.nextInt()];
		int ch, i = 0, index = 0;

		System.out.println("1. Add Mango\r\n" + "2. Add Orange\r\n" + "3. Add Apple\n"
				+ "4.display names of all fruits\n" + "5.Display name,color,weight , taste of all fresh fruits\n"
				+ "6.Mark a fruit in a basket , as stale(=not fresh)\n" + "7.Mark all sour fruits stale\n"
				+ "8.Invoke fruit specific functionality (pulp / juice / jam)");

		do {
			System.out.println("enter your choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < basket.length) {
					System.out.println("Enter <name> <color> <weight>");
					basket[index++] = new Mango(sc.next(), sc.next(), sc.nextDouble());
				}
				break;

			case 2:
				if (index < basket.length) {
					System.out.println("Enter <name> <color> <weight>");
					basket[index++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
				}
				break;

			case 3:
				if (index < basket.length) {
					System.out.println("Enter <name> <color> <weight>");
					basket[index++] = new Apple(sc.next(), sc.next(), sc.nextDouble());
				}
				break;

			case 4:
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println("Fruit name :" + f.getName());
					}
				}
				break;

			case 5:
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println(f + "\nTaste is " + f.taste());
						System.out.println();
					}
				}
				break;

			case 6:
				// Mark a fruit in a basket , as stale(=not fresh)
				// i/p : index
				// o/p : error message (in case of invalid index) or mark it stale
//				System.out.println("Enter the type or Fruit you want to declare stale ");
//				String s = sc.next();
//				for (Fruit f : basket) {
//					if (f != null) {
//						if (f.getName().equals(s)) {
//							f.setFresh(false);
//							System.out.println(f.getName() + " is Stale");
//						}
//					}
//				}
				System.out.println("enter the index");
				i = sc.nextInt();
				if (i >= 0 && i < basket.length) {
					basket[i].setFresh(false);
					if (basket[i].isFresh() == false)
						System.out.println(basket[i].getName() + " is Stale ");
				}
				break;

			case 7:
				System.out.println("Mark all sour fruits stale");
				for (Fruit f : basket) {
					if (f != null) {
						if (f.taste().equals("sour")) {
							f.setFresh(false);
							System.out.println(f.getName() + " is Stale ");
							System.out.println();
						}
					}
				}
				break;

			case 8:
				// Invoke fruit specific functionality (pulp / juice / jam)
//				i/p : index
//				Invoke correct functionality (pulp / juice / jam)
				System.out.println("enter the index ");
				int j = sc.nextInt();
				if (j >= 0 && j < basket.length) {
					if (basket[j] != null) {
						if (basket[j] instanceof Mango) {
							((Mango) basket[j]).pulp();
							System.out.println("----------------------");
						} else if (basket[j] instanceof Apple) {
							((Apple) basket[j]).jam();
							System.out.println("----------------------");
						} else if (basket[j] instanceof Orange) {
							((Orange) basket[j]).juice();
							System.out.println("----------------------");
						}
					}
				}
//				for (Fruit f : basket) {
//					if (f != null) {
//						if (f instanceof Mango) {
//							((Mango) f).pulp();
//							System.out.println("----------------------");
//						} else if (f instanceof Apple) {
//							((Apple) f).jam();
//							System.out.println("----------------------");
//						} else if (f instanceof Orange) {
//							((Orange) f).juice();
//							System.out.println("----------------------");
//						}
//
//					}
//				}
				break;

			default:
				System.out.println("---------Shop Closed----------");
				break;

			}
		} while (ch < 9);
		sc.close();
		exit(0);
	}

}
