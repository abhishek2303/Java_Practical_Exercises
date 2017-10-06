package com.stackroute.ps3.language_basics.toys;

import com.stackroute.ps3.language_basics.LogHelper;

public class FlyingAndMovingToy implements Toy, Flyable, Moveable{
	private int price;
	private String color;
	
	public FlyingAndMovingToy() {
		LogHelper.logDetails("Toy that can move and fly created");
	}

	@Override
	public void move() {
		LogHelper.logDetails("Toy is moving");
	}

	@Override
	public void fly() {
		LogHelper.logDetails("Toy is flying");
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
