package com.stackroute.ps3.language_basics;

public class BulbSwitch implements Switch {
	//state variable of the switch
	private boolean state;
	
	//no-arg constructor
	public BulbSwitch() {
		this.state = false;
	}

	//toggle state of the switch
	public void toggle() {
		this.state = this.state ? false : true;
	}

	//retrieve the state of the switch
	public boolean getState() {
		return this.state;
	}

}
