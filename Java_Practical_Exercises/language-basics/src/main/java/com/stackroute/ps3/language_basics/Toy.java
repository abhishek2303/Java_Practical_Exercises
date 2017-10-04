package com.stackroute.ps3.language_basics;

public class Toy {
	private int price;
	private String color;
	
	public Toy() {
		
	}
	
	public Toy(int price, String color) {
		this.price = price;
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
