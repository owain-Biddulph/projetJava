package core;

import java.util.Random;

public class ProbabilityDistribution {
	private static Random rand = new Random();
	// contains random int functions. should return an int between 0 and i-1
	public static int gamma(int i, int j) {
		return(0);
	}
	
	public static int logNorm(int i, int j) {
		return(0);
	}
	
	public static int exp(double lambda) {
		return (int) (-(1/lambda)*Math.log(1 - rand.nextDouble()));
		}
	
	public static int uniform(int i, int j) {
		return((int) rand.nextFloat()*(j-i) + i);
	}
	
	public static double uniform(double i, double j) {
		return(rand.nextDouble()*(j-i) + i);
	}
}
