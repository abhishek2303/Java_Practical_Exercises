package com.stackroute.ps3.language_basics.toys;

import java.util.Set;

public class OldToyBuilder implements ToyBuilder {
	
	private Toy toy;
	
	public OldToyBuilder() {
		this.toy = new SimpleToy();
	}
	
	//options contain if the toy is flyable/moveable
	public OldToyBuilder(Set<String> options) {
		if(options.size() == 2) {
			this.toy = new FlyingAndMovingToy();
		} else if( options.size() == 1 && options.contains("flyable")) {
			this.toy = new FlyingToy();
		} else if( options.size() == 1 && options.contains("moveable")) {
			this.toy = new MovingToy();
		} else {
			this.toy = new SimpleToy();
		}
	}

	public void buildPrice() {
		this.toy.setPrice(50);
	}
	
	public void buildColor() {
		this.toy.setColor("red");
	}

	public Toy getToy() {
		return this.toy;
	}
	
}