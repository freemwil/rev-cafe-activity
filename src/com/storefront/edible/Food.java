package com.storefront.edible;

public class Food {

	private double price;
	private String name;
	private String description;
	
	public Food() {
		setPrice(0);
		setName("food");
	}
	
	public Food(String name, Double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	
//Setters and Getters
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return getName() + " : " + getPrice();
	}
	
	
}
