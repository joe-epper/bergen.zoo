package edu.bergen.project2;

/**
 * A duck billed platypus is the only kind of mammal who lays eggs
 */
public class DuckBilledPlatypus extends Mammal {

	public DuckBilledPlatypus(String name, String species, double weight) {
		super(name, species, weight);
	}

	@Override
	public Birth getHowItGivesBirth() {
		return Birth.EGGS;
	}

	
}
