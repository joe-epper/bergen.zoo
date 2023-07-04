package edu.bergen.project2;
/**
 * A bird is a kind of AbstractAnimal who flies, breathes through lungs, lays eggs, is warm blooded and is covered in feathers
 */
public class Bird extends AbstractAnimal {

	public Bird(String name, String species, double weight) {
		super(name, species, weight);
	}

	@Override
	public Movement getHowItMovesAround() {
		return Movement.FLIES;
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
		return BloodTemp.WARM;
	}

	@Override
	public SkinCovering getSkinCovering() {
		return SkinCovering.FEATHERS;
	}

}
