package edu.bergen.project2;

/**
 * An amphibian is a kind of AbstractAnimal who walks, breathes through lungs, lays eggs, is cold blooded and is covered in nothing
 */
public class Amphibian extends AbstractAnimal {

	public Amphibian(String name, String species, double weight) {
		super(name, species, weight);
	}

	@Override
	public Movement getHowItMovesAround() {
		return Movement.WALKS;
	}

	@Override
	public Respiration getHowItBreathes() {
		return Respiration.LUNGS;
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
		return SkinCovering.NOTHING;
	}

}
