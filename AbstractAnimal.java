package edu.bergen.project2;

public abstract class AbstractAnimal implements Animal {

	private String name;
	private String species;
	private double weight;

	public AbstractAnimal(String name, String species, double weight) {
		super();
		this.name = name;
		this.species = species;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public double getWeight() {
		return weight;
	}

	public abstract Movement getHowItMovesAround();

	
	public abstract Respiration getHowItBreathes();

	
	public abstract Birth getHowItGivesBirth(); 


	public  abstract BloodTemp getBloodTemperature(); 

	public abstract SkinCovering getSkinCovering();

	
	public String toShortString() {
		return name + " the " + species;
	}

	
	public String toString() {
		return "AbstractAnimal [name=" + name + ", species=" + species + ", weight=" + weight + "]";
	}

}
