package com.stackroute.ps3.language_basics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {
	private static Logger logger;
	
	public static void logDetails(String message) {
		if(logger == null) {
			logger = LogManager.getRootLogger();
		}
		
		logger.debug(message);
	}
	
}