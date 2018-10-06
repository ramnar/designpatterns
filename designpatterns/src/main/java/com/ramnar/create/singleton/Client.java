package com.ramnar.create.singleton;

public class Client {
	
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.logMessage("This is my first log message");
	}

}
