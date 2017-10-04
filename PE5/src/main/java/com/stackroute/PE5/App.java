package com.stackroute.PE5;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

   
public class App {
    private static Logger logger = LogManager.getLogger("App.class");

    public static void main( String[] args ) {
		System.out.println( "Hello World!" );
		
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
	}
}
