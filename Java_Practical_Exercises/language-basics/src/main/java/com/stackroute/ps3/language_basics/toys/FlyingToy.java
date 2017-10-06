package com.stackroute.ps3.language_basics.toys;

import com.stackroute.ps3.language_basics.LogHelper;

public class FlyingToy implements Toy, Flyable {

	private int price;
	private String color;
	
	public FlyingToy() {
		LogHelper.logDetails("Flyable Toy created");
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

	@Override
	public void fly() {
		LogHelper.logDetails("Toy is flying");
	}
	
	

}
