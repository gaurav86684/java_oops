package org.studyeasy.birds;

import org.studyeasy.parent.Animal;

public class Bird extends Animal{
    private boolean fly;
    
    public Bird() {
    	super();
    	this.fly=true;
    }

	public Bird(boolean fly) {
		super();
		this.fly = fly;
	}
    
	public void setBird(boolean fly) {
		this.fly=fly;
	}
	
	public boolean getBird() {
		return this.fly;
	}
    
}
