package com.stackroute.ps3.language_basics.device_and_switch;

public class Bulb implements Switchable{
	//switch variable
	private Switch bulbSwitch;
	
	//no-arg constructor
	public Bulb() {
		bulbSwitch = new BulbSwitch();
	}
	
	//constructor with custom switch
	//For less coupling. The bulb does not depend on how the
	//bulb's switch is constructed
	public Bulb(Switch bulbSwitch) {
		this.bulbSwitch = bulbSwitch;
	}
	
	//prints the status of the bulb
	public void printStatus() {
		System.out.println(bulbSwitch.getState() ? "Bulb is ON": "Bulb is OFF");
	}
	
	//switches ON the bulb if the bulb is OFF
	public void switchON() {
		if(!bulbSwitch.getState()) {
			bulbSwitch.toggle();
			System.out.println("Bulb switched ON");
		} else {
			System.out.println("Bulb already ON");
		}
		
	}
	
	//switches OFF the bulb if bulb is ON
	public void switchOFF() {
		if(bulbSwitch.getState()) {
			bulbSwitch.toggle();
			System.out.println("Bulb switched OFF");
		} else {
			System.out.println("Bulb already OFF");
		}
		
	}
	
}
