package edu.bergen.project2;

public interface Animal {
	public String getName();
	public String getSpecies();
	public double getWeight();
	public Movement getHowItMovesAround();
	public Respiration getHowItBreathes();
	public Birth getHowItGivesBirth();
	public BloodTemp getBloodTemperature();
	public SkinCovering getSkinCovering();
	public String toShortString();
}