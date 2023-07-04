package edu.bergen.project2;

/**
 * A swimming mammal is a kind of mammal who swims and has no skin covering
 * Examples include whales, dolphins, and sea cows
 */
public class SwimmingMammal extends Mammal {

	public SwimmingMammal(String name, String species, double weight) {
		super(name, species, weight);
	}

	@Override
	public Movement getHowItMovesAround() {
		return Movement.SWIMS;
	}

	@Override
	public SkinCovering getSkinCovering() {
		return SkinCovering.NOTHING;
	}

}
