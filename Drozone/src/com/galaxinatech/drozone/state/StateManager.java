package com.galaxinatech.drozone.state;

public class StateManager {

	int currentState = 0;

	public static final int STATE_MENU = 0;
	public static final int STATE_GAME = 1;

	public int getCurrentState() {
		return currentState;
	}

	public void setCurrentState(int state) {
		currentState = state;
	}
}
