package edu.bergen.project2;

/**
 * A flightless bird is a kind of Bird who walks, not flies
 * Examples include ostriches, emus, and dodos
 */
public class FlightlessBird extends Bird {

	public FlightlessBird(String name, String species, double weight) {
		super(name, species, weight);
	}

	@Override
	public Movement getHowItMovesAround() {
		return Movement.WALKS;
	}

	
}
