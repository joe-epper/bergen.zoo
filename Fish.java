package edu.bergen.project2;

/**
 * A fish is a kind of AbstractAnimal who swims, breathes through gills, lays eggs, is cold blooded and is covered in scales
 */
public class Fish extends AbstractAnimal {

	public Fish(String name, String species, double weight) {
		super(name, species, weight);
	}

	@Override
	public Movement getHowItMovesAround() {
		return Movement.SWIMS;
	}

	@Override
	public Respiration getHowItBreathes() {
		return Respiration.GILLS;
	}

	@Override
	public Birth getHowItGivesBirth() {
		return Birth.EGGS;
	}

	@Override
	public BloodTemp getBloodTemperature() {
		return BloodTemp.COLD;
	}

	@Override
	public SkinCovering getSkinCovering() {
		return SkinCovering.SCALES;
	}

}
