package com.ramnar.dp.bhvr.interpreter;

public class TerminalExpression implements Expression {
	
	private String data;

	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	public boolean interpret(String content) {
		if(content.contains(data)) return true;
		return false;
	}

}
