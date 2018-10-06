package com.ramnar.behaviour.interpreter;

public class OrExpression implements Expression {
	
	private Expression ex1;
	
	private Expression ex2;

	public OrExpression(Expression ex1, Expression ex2) {
		super();
		this.ex1 = ex1;
		this.ex2 = ex2;
	}

	public boolean interpret(String content) {
		return ex1.interpret(content) || ex2.interpret(content); 
	}

}
