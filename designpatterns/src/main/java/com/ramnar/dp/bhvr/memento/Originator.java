package com.ramnar.dp.bhvr.memento;

public class Originator {

	private String state;

	public void setState(String state) {
		this.state = state;
	}
	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public String restoreFromMemento(Memento memento) {
		return memento.getState();
	}

}
