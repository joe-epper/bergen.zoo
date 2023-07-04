package edu.bergen.project2;

/**
 * A class with a static factory method for building objects that conform to the Animal interface
 */
public class AnimalFactory {
	/**
	 * Builds an appropriate object that obeys the Animal interface.  
	 * The class used is based on the animal species
	 * @param name the nickname of the animal
	 * @param species the type of animal that this is
	 * @param weight how much the animal weighs
	 * @return an object that obeys the Animal interface
	 */
	public static final Animal getInstance(String name, String species, double weight) {
		if (species.equals("Hawk")) return new Bird(name, species, weight);
		else if (species.equals("Owl")) return new Bird(name, species, weight);
		else if (species.equals("Salamander")) return new Amphibian(name, species, weight);
		else if (species.equals("Bear")) return new Mammal(name, species, weight);
		else if (species.equals("Crocodile")) return new Reptile(name, species, weight);
		else if (species.equals("Elephant")) return new Mammal(name, species, weight);
		else if (species.equals("Eagle")) return new Bird(name, species, weight);
		else if (species.equals("Flamingo")) return new FlightlessBird(name, species, weight);
		else if (species.equals("Newt")) return new Amphibian(name, species, weight);
		else if (species.equals("Lizard")) return new Reptile(name, species, weight);
		else if (species.equals("Lion")) return new Mammal(name, species, weight);
		else if (species.equals("Trout")) return new Fish(name, species, weight);
		else if (species.equals("Parrot")) return new Bird(name, species, weight);
		else if (species.equals("Pig")) return new Mammal(name, species, weight);
		else if (species.equals("Snake")) return new Reptile(name, species, weight);
		else if (species.equals("Salmon")) return new Fish(name, species, weight);
		else if (species.equals("Frog")) return new Amphibian(name, species, weight);
		else if (species.equals("Shark")) return new Fish(name, species, weight);
		else if (species.equals("Turtle")) return new Reptile(name, species, weight);
		else if (species.equals("Toad")) return new Amphibian(name, species, weight);
		else if (species.equals("Tuna")) return new Fish(name, species, weight);
		else if (species.equals("Boa")) return new Reptile(name, species, weight);
		else if (species.equals("Kangaroo")) return new Mammal(name, species, weight);
		else if (species.equals("Vampire")) return new Mammal(name, species, weight);
		else if (species.equals("Ostrich")) return new FlightlessBird(name, species, weight);
		else if (species.equals("Giraffe")) return new Mammal(name, species, weight);
		else return null;
	}
}
