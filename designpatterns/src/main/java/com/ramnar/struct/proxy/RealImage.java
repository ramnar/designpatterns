package com.ramnar.struct.proxy;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading from disk " + fileName);
		
	}

	public void display() {
		System.out.println("Displaying image " + fileName);

	}

}
