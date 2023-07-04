package edu.bergen.project2;

import java.util.ArrayList;

public class ZooKeeper {

	public ZooKeeper() {	}

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo();
		myZoo.addAnimal(AnimalFactory.getInstance("Eli", "Elephant", 3000.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Betty", "Boa", 20.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Katerina", "Kangaroo", 600.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Voldomir", "Vampire", 10.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Oksana", "Ostrich", 300.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Sophia", "Salamander", 2.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Gianluca", "Giraffe", 800.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Lisa", "Lion", 700.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Samuel", "Shark", 300.0));
		myZoo.addAnimal(AnimalFactory.getInstance("Harry", "Hawk", 10.0));
		
		
		ArrayList<Animal> result = new ArrayList<Animal>();
		
		System.out.println("All cold blooded animals:");
		for(Animal a : myZoo.getAllColdBloodedAnimals()) {
			System.out.println(a.toShortString());
		}
		
		System.out.println();  // line space
		
		System.out.println("All egg laying animals:");
		for(Animal a : myZoo.getAllEggLayingAnimals()) {
			System.out.println(a.toShortString());
		}
		
		System.out.println();  // line space
		
		System.out.println("All animals that breathe with gills:");
		for(Animal a : myZoo.getAllGillBreathingAnimals()) {
			System.out.println(a.toShortString());
		}
		
		System.out.println();  // line space
		
		System.out.println("All animals named Lisa:");
		for(Animal a : myZoo.getAllAnimalsWithName("Lisa")) {
			System.out.println(a.toString());
		}
		
		System.out.println();  // line space
		
		System.out.println("Number of animals in the zoo: " + myZoo.numberOfAnimalsInZoo());
		
	}

}
