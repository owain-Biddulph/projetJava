package core;

import java.util.Random;

public class ProbabilityDistribution {
	// contains random int functions. should return an int between 0 and i-1
	public static int gamma(int i, int j) {
		return(0);
	}
	
	public static int logNorm(int i, int j) {
		return(0);
	}
	
	public static int exp(int i, int j) {return(0);}
	
	public static int uniform(int i, int j) {
		Random rand = new Random();
		return((int) rand.nextFloat()*(j-i) + i);
	}
	
	public static float uniform(float i, float j) {
		Random rand = new Random();
		return(rand.nextFloat()*(j-i) + i);
	}
}
