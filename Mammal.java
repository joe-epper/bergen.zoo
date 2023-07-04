package edu.bergen.project2;

/**
 * A mammal is a kind of AbstractAnimal who walks, breathes through lungs, gives live birth, is warm blooded and is covered in fur
 */
public class Mammal extends AbstractAnimal {

	public Mammal(String name, String species, double weight) {
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
		return Birth.LIVE;
	}

	@Override
	public BloodTemp getBloodTemperature() {
		return BloodTemp.WARM;
	}

	@Override
	public SkinCovering getSkinCovering() {
		return SkinCovering.FUR;
	}

}
