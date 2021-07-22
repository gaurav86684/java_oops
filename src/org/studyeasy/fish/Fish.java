package org.studyeasy.fish;

import org.studyeasy.parent.Animal;

public class Fish extends Animal{
	
	private String home;
	private boolean gillPresent;
	
	public Fish() {
		super();
		this.gillPresent=true;
		this.home="water";
	}

	public Fish(String home, boolean gillPresent) {
		super();
		this.home = home;
		this.gillPresent = gillPresent;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public boolean isGillPresent() {
		return gillPresent;
	}

	public void setGillPresent(boolean gillPresent) {
		this.gillPresent = gillPresent;
	}
	
	

}
