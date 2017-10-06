package com.stackroute.ps3.language_basics.toys;

import java.util.HashSet;
import java.util.Set;

import com.stackroute.ps3.language_basics.LogHelper;

public class TestToyBuilder {
	public static void main(String[] args) {
		Set<String> options = new HashSet<String>();
		options.add("flyable");
		options.add("moveable");
		
		ToyBuilder toyBuilder = new OldToyBuilder();
		toyBuilder.buildColor();
		toyBuilder.buildPrice();
		LogHelper.logDetails("");
		
		toyBuilder = new OldToyBuilder(options);
		toyBuilder.buildColor();
		toyBuilder.buildPrice();
		Toy flyingToy = toyBuilder.getToy();
		((FlyingAndMovingToy)flyingToy).fly();
	}
}