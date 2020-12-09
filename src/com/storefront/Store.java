package com.storefront;

import com.storefront.edible.Food;
import com.storefront.menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

	private static Menu cafeMenu;
	private static ArrayList<Food> order;

	public static void main(String[] args) {
		order = new ArrayList<Food>();
		
		Scanner scan = new Scanner(System.in);
		cafeMenu = new Menu();
		System.out.println("Good morning and welcome to my shop!");
		System.out.println("If you know what you would like to order, please add each item below one at a time.  When you are finised type \"Yes\"");
		System.out.println("If you would like to see our menu, type \"Menu\" below");
		
		boolean complete = false;
		String selection = scan.next();
		if(selection.equalsIgnoreCase("menu"))
			printMenu(cafeMenu);
		
		else {
			while(!complete) {
				if(selection.equalsIgnoreCase("yes"))
					complete = true;
				else {
					orderAdd(selection);
					selection = scan.next();
				}
					
			}
		}
		
		System.out.println("Here is your order: ");
		for(Food f: order) {
			System.out.println(f.toString());
			priceMe(order);
		}
		//remove items from order
		System.out.println("to remove any items, please type the name one at a time. or type \"Yes\" to finalize your order");
		String finalize = scan.next();
		if(finalize.equalsIgnoreCase("yes")) {
			System.out.println("Your total comes to: " + priceMe(order));
		}
		else {
		 boolean remove = true;
		while(remove) {
			orderRemove(finalize);
			System.out.println("To finalize your order enter \"Yes\", keep typing menu items to remove them from your order. ");
			finalize = scan.next();
			if(finalize.equalsIgnoreCase("yes")) {
				remove = false;
				System.out.println("Your total comes to: " + priceMe(order));
				}
			}
		}
	}

	

	/*
	 * this will parse the order so that the driver can call the correct menu item
	 * This will reduce issues with case sensitivity;
	 */
	public static String parser(String order) {
		return "";
	}

	public static void printMenu(Menu myMenu) {
		System.out.println("Here is our menu this morning: ");
		myMenu.getMenu();
	}

	public static double priceMe(ArrayList<Food> order) {
		double total = 0;
		for (Food f : order) {
			total += f.getPrice();
		}
		return total;
	}

	public static void orderAdd(String item) {
		order.add(cafeMenu.getItem(item));
	}

	public static void orderRemove(String item) {
		if (order.contains(cafeMenu.getItem(item))) {
			order.remove(cafeMenu.getItem(item));
		} else
			System.out.println("You have not ordered this item.");
	}
}
