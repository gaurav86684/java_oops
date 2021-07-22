package org.studyeasy;

import org.studyeasy.birds.Bird;
import org.studyeasy.parent.Animal;
import org.studyeasy.reptiles.Reptiles;
import org.studyeasy.reptiles.Crocodiles;

public class Demo {

	public static void main(String[] args) {

		 Animal animal=new Animal();
		 Reptiles reptiles=new Reptiles();
		// System.out.println(reptiles.getHeight());
		 Bird bird=new Bird();
		 Crocodiles croc=new Crocodiles();
		 System.out.println(croc.showInfo());
	}

}
