package com.ramnar.dp.bhvr.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber1 implements Observer {

	public void update(Observable arg0, Object arg1) {
		System.out.println("subscriber1 got the news " + arg1);

	}

}
