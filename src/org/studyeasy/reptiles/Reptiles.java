package org.studyeasy.reptiles;

import org.studyeasy.parent.Animal;

public class Reptiles extends Animal{
	
	private String skin;
	private String backbone;
	private String egg;
	
	public Reptiles() {
		super();
		this.skin="soft";
		this.backbone="present";
		this.egg="shelled";
	}

	public Reptiles(String skin, String backbone, String egg) {
		super();
		this.skin = skin;
		this.backbone = backbone;
		this.egg = egg;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getBackbone() {
		return backbone;
	}

	public void setBackbone(String backbone) {
		this.backbone = backbone;
	}

	public String getEgg() {
		return egg;
	}

	public void setEgg(String egg) {
		this.egg = egg;
	}
	
	

}
