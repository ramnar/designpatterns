package com.ramnar.create.singleton;

public class Logger {

	private static Logger logger;

	public static Logger getInstance() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	private Logger() {
		
	}
	
	public void logMessage(String message) {
		System.out.println(message);
	}
}
