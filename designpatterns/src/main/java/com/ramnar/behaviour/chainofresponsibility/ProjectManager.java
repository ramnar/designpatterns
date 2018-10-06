package com.ramnar.behaviour.chainofresponsibility;

public class ProjectManager extends AbstractManager {

	@Override
	protected long getMaxBudget() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	protected String getRole() {
		// TODO Auto-generated method stub
		return "ProjectManager";
	}

}
