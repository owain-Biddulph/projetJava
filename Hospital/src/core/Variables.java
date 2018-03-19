package core;

import java.util.Scanner;

public class Variables {
	
	public static class Registration {
		private static int time = 1;
		private static int cost = 0;
		
		public static int getTime() {return time;}
		public static void setTime(int time) {Registration.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {Registration.cost = cost;}
	}
	
	public static class test {
		private static int time = 1;
		private static int cost = 0;
		
		public static int getTime() {return time;}
		public static void setTime(int time) {Registration.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {Registration.cost = cost;}
		
	}

	public static class L1 {
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getNextArrivalTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(0);}
		}

		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}
	
	public static class L2 {
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getNextArrivalTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(0);}
		}

		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}
	
	public static class L3 {
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getNextArrivalTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(0);}
		}

		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}
	
	public static class L4 {
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getNextArrivalTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(0);}
		}

		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}
	
	public static class L5 {
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getNextArrivalTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(0);}
		}

		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}

}
