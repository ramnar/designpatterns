package com.ramnar.dp.bhvr.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> list = new ArrayList<Memento>();
	
	public void saveState(Memento memento) {
		list.add(memento);
	}
	
	public Memento getState(int index) {
		return list.get(index);
	}
}
