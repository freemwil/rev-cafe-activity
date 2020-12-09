package com.storefront.menu;

import java.util.ArrayList;
import com.storefront.edible.*;

public class Menu {

	private ArrayList<Food> foodMenu;
	private Food biscuit;
	private Food bagel;
	private Food croissant;
	private Food water;
	private Food tea;
	private Food coffee;
	
	
	public Menu() {
		foodMenu = new ArrayList<Food>();
		foodMenu.add(biscuit = new Food("Biscuit", 1.99));
		foodMenu.add(bagel =  new Food("Bagel", 0.99));
		foodMenu.add(croissant = new Food("Croissant", 3.99));
		foodMenu.add(water = new Food("Water", 0.99));
		foodMenu.add(tea = new Food("Tea", 1.99));
		foodMenu.add(coffee = new Food("Coffee", 1.69));	
	}
	
	public void getMenu() {
		for(Food f: foodMenu) {
			System.out.println(f.toString());
			
		}
	}
	
	public Food getItem(String item) {
		if(item.equalsIgnoreCase("biscuit")) {
			return biscuit;
		}
		else if(item.equalsIgnoreCase("bagel")) {
			return bagel;
		}
		else if(item.equalsIgnoreCase("croissant")) {
			return croissant;
		}
		else if(item.equalsIgnoreCase("water")) {
			return water;
		}
		else if(item.equalsIgnoreCase("tea")) {
			return tea;
		}
		else if(item.equalsIgnoreCase("coffee")) {
			return coffee;
		}
		return null;
		
	}
	

}
