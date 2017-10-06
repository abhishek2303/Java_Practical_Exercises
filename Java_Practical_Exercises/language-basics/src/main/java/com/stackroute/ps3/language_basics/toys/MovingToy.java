package com.stackroute.ps3.language_basics.toys;

import com.stackroute.ps3.language_basics.LogHelper;

public class MovingToy implements Toy, Moveable{
	private int price;
	private String color;
	
	public MovingToy() {
		LogHelper.logDetails("Moveable Toy created");
	}

	@Override
	public void move() {
		LogHelper.logDetails("Is moving");
		
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(int price) {

		this.price = price;
		
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
		
	}
	
	

}
