package core;

import java.util.*;



public abstract class Examination extends Event{
	protected Room room;
	protected boolean consultationNeeded;
	
	public static String randomExamination(double noTestProbability, double radiographyProbability, double bloodTestProbability, double MRIProbability) {
		Random rand = new Random();
		float randomFloat = rand.nextFloat();
		if(0 <= randomFloat && randomFloat < noTestProbability) {
			return "No Test";
		}
		else if(noTestProbability <= randomFloat && randomFloat < radiographyProbability + noTestProbability) {
			return "Radiography";
		}
		else if(radiographyProbability + noTestProbability <= randomFloat && randomFloat < radiographyProbability + noTestProbability + bloodTestProbability) {
			return "Blood Test";
		}
		else {
			return "MRI";
		}
	}
}
