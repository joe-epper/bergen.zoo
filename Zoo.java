package edu.bergen.project2;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animalsInZoo = new ArrayList<Animal>();
	
	public Zoo() {	}
	
	public ArrayList<Animal> getAnimalsInZoo() { return animalsInZoo;	}
	
	public ArrayList<Animal> getAllAnimalsOfSpecies(String species) {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getSpecies().equals(species))
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {												// replace the for loop and the if block
			if(a.getSpecies().equals(species)) {answers.add(a);}        // with a stream using lambda expressions
		}	*/																						// example at getAllEggLayingAnimals() 
		return answers;
	}
	
	public ArrayList<Animal> getAllAnimalsWithName(String name) {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getName().equals(name))
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {												// replace the for loop and the if block
			if(a.getName().equals(name)) {answers.add(a);}       		// with a stream using lambda expressions
		}*/																							// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllColdBloodedAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getBloodTemperature() == BloodTemp.COLD)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getBloodTemperature() == BloodTemp.COLD) {answers.add(a);}   // with a stream using lambda expressions
		}*/																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllEggLayingAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream().filter(animal->animal.getHowItGivesBirth() == Birth.EGGS).forEach(animal->answers.add(animal));
		/*for(Animal a : animalsInZoo) {
			if(a.getHowItGivesBirth() == Birth.EGGS) {answers.add(a);}
		}*/
		return answers;
	}
	
	public ArrayList<Animal> getAllFlyingAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getHowItMovesAround() == Movement.FLIES)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getHowItMovesAround() == Movement.FLIES) {answers.add(a);}	// with a stream using lambda expressions
		}*/																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllFurryAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getSkinCovering() == SkinCovering.FUR)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getSkinCovering() == SkinCovering.FUR) {answers.add(a);}			// with a stream using lambda expressions
		}*/																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllGillBreathingAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getHowItBreathes() == Respiration.GILLS)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getHowItBreathes() == Respiration.GILLS) {answers.add(a);}			// with a stream using lambda expressions
		}*/																											// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllHeavyAnimals(double weight) {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getWeight() > weight)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getWeight() > weight) {answers.add(a);}											// with a stream using lambda expressions
		}*/																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllLiveBirthAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getHowItGivesBirth() == Birth.LIVE)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getHowItGivesBirth() == Birth.LIVE) {answers.add(a);}					// with a stream using lambda expressions
		}*/																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllLungBreathingAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getHowItBreathes() == Respiration.LUNGS)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getHowItBreathes() == Respiration.LUNGS) {answers.add(a);}		// with a stream using lambda expressions
		}*/																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllSwimmingAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getHowItMovesAround() == Movement.SWIMS)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getHowItMovesAround() == Movement.SWIMS) {answers.add(a);}	// with a stream using lambda expressions
		}*/																											// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllWalkingAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		animalsInZoo.stream()
		.filter(a->a.getHowItMovesAround() == Movement.WALKS)
		.forEach(a->answers.add(a));
		/*for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getHowItMovesAround() == Movement.WALKS) {answers.add(a);}	// with a stream using lambda expressions
		}*/																											// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public ArrayList<Animal> getAllWarmBloodedAnimals() {
		ArrayList<Animal> answers = new ArrayList<Animal>();
		for(Animal a : animalsInZoo) {																	// replace the for loop and the if block
			if(a.getBloodTemperature() == BloodTemp.WARM) {answers.add(a);}	// with a stream using lambda expressions
		}																												// example at getAllEggLayingAnimals()
		return answers;
	}
	
	public int numberOfAnimalsInZoo() {
		return animalsInZoo.size();
	}
	public void addAnimal(Animal a) {
		animalsInZoo.add(a);
	}

	
	
}
