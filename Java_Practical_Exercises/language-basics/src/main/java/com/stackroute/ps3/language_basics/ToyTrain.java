package com.stackroute.ps3.language_basics;

public class ToyTrain extends Toy implements Moveable{
	private int speed;
	
	public ToyTrain() {
		super();
		this.speed = 0;
	}
	
	public ToyTrain(int price, String color) {
		super(price, color);
		this.speed = 0;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		if(speed > -1) {
			this.speed = speed;
		}
	}

	public void speedUp() {
		this.speed++;
		
	}

	public void slowDown() {
		if(this.speed > 0) {
			this.speed--;
		}
	}

}
