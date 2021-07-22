package org.studyeasy.reptiles;

public class Crocodiles extends Reptiles{
	
	public Crocodiles() {
		super();
		this.setEgg("Hard");
	}

	
	public String showInfo() {
		return "Crocodiles [getSkin()=" + getSkin() + ", getBackbone()=" + getBackbone() + ", getEgg()=" + getEgg()
				+ ", getHeight()=" + getHeight() + ", getWidth()=" + getWidth() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + "]";
	}
	
	

}
