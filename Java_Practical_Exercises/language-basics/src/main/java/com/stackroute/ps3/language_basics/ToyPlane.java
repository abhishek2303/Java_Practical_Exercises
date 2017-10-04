package com.stackroute.ps3.language_basics;

public class ToyPlane extends Toy implements Flyable, Moveable {

	private int speed;
	private int altitude;
	
	public ToyPlane() {
		super();
		this.speed = 0;
		this.altitude = 0;
	}
	
	public ToyPlane(int price, String color) {
		super(price, color);
		this.speed = 0;
		this.altitude = 0;
	}
	
	public int getSpeed() {
		return this.speed++;
	}

	public void speedUp() {
		this.speed++;
	}

	public void slowDown() {
		if(this.speed > 0) {
			this.speed--;
		}
		
	}

	public int getAltitude() {
		return this.altitude;
	}

	public void ascent() {
		this.altitude++;
		
	}

	public void decent() {
		if(this.altitude > 0) {
			this.altitude--;
		}
	}
	
	

}
