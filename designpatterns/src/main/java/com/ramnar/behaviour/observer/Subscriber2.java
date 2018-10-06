package com.ramnar.behaviour.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber2 implements Observer {

	public void update(Observable arg0, Object arg1) {
		System.out.println("subscriber2 got the news " + arg1);

	}

}
