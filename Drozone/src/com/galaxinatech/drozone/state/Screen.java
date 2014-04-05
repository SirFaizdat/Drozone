package com.galaxinatech.drozone.state;

import java.awt.Graphics2D;

public abstract class Screen {

	int state;
	Graphics2D g;
	
	public Screen(int state, Graphics2D g) {
		this.state = state;
		this.g = g;
	}
	
	public abstract void loop();
	
}
