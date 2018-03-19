package core;

import java.util.Random;

public class ProbabilityDistribution {
	private static Random rand = new Random();
	
	public static double det(double delta) {return delta;}
	
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
