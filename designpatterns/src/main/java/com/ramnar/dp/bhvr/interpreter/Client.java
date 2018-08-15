package com.ramnar.dp.bhvr.interpreter;

public class Client {
	
	public static Expression getMaleExpression() {
		Expression ram = new TerminalExpression("ram");
		Expression rahul = new TerminalExpression("rahul");
		return new OrExpression(ram, rahul);
	}

	public static void main(String[] args) {
		System.out.println(getMaleExpression().interpret("ram"));

	}

}
