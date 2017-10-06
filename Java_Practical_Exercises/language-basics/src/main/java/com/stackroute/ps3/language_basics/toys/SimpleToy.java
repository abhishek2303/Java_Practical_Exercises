package com.stackroute.ps3.language_basics.toys;

import com.stackroute.ps3.language_basics.LogHelper;

public class SimpleToy implements Toy{
	private int price;
	private String color;
	
	public SimpleToy() {
		LogHelper.logDetails("Simple Toy created");
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
