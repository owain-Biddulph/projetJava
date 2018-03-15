package core;

import java.util.Scanner;

public class Variables {
	
	public class L1 {
		private String probabilityDistribution = "Uniform";
		private int int1 = 40;
		private int int2 = 80;
		private double double1;
		
		public int getNextArrivalTime() {
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
	
	public class L2 {
		private String probabilityDistribution = "Uniform";
		private int int1 = 30;
		private int int2 = 60;
		private double double1;
		
		public int getNextArrivalTime() {
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
	
	public class L3 {
		private String probabilityDistribution = "Uniform";
		private int int1 = 20;
		private int int2 = 40;
		private double double1;
		
		public int getNextArrivalTime() {
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
	
	public class L4 {
		private String probabilityDistribution = "Uniform";
		private int int1 = 5;
		private int int2 = 20;
		private double double1;
		
		public int getNextArrivalTime() {
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
	
	public class L5 {
		private String probabilityDistribution = "Uniform";
		private int int1 = 5;
		private int int2 = 20;
		private double double1;
		
		public int getNextArrivalTime() {
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
