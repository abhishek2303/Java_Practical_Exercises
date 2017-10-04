package com.stackroute.lamda_PS5;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogHelper {
	private static Logger logger;
	
	public static void logDetails(String message) {
		if(logger == null) {
			logger = LogManager.getRootLogger();
		}
		
		logger.debug(message);
	}
	
}