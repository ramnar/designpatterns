package com.ramnar.dp.bhvr.state;

public class MobileContext {
	
	private IMobileMode mobileMode;
	
	
	public MobileContext() {
		mobileMode = new SilentMode();
	}

	public void setState(IMobileMode mobileMode) {
		this.mobileMode = mobileMode;
	}
	
	public void displayStatus() {
		mobileMode.alertMode(this);
	}
	
	

}
