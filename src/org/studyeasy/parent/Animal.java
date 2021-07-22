package org.studyeasy.parent;

public class Animal {
    
	private int height;
	private int width;
	private String animalType;
	private String bloodType;
	
	public Animal() {
		this.height= 152;
		this.width=48;
		this.animalType="four legged";
		this.bloodType="hot-blooded";
	}

	public Animal(int height, int width, String animalType, String bloodType) {
		super();
		this.height = height;
		this.width = width;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	
	
}
