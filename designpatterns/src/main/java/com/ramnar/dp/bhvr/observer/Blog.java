package com.ramnar.dp.bhvr.observer;

import java.util.Observable;

public class Blog extends Observable {
	
	public void updateNews(String news) {
		setChanged();
		notifyObservers(news);
	}

}
