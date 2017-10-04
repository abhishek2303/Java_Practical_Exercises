package com.stackroute.ps3.language_basics;

import java.util.Set;

public class OldToyBuilder implements ToyBuilder {
	
	private Toy toy;
	
	public OldToyBuilder() {
		this.toy = new Toy();
	}
	
	//options contain if the toy is flyable/moveable
	public OldToyBuilder(Set<String> options) {
		if(options.size() == 2) {
			this.toy = new ToyTrain();
		} else if( options.size() == 1) {
			this.toy = new ToyPlane();
		} else {
			this.toy = new Toy();
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