package core;

import java.util.Scanner;

public class Variables {
	
	public static class Arrival {
		private static int cost = 0;

		public static int getCost() {return cost;}
		public static void setCost(int cost) {Arrival.cost = cost;}
	}
	
	public static class Registration {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {Registration.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {Registration.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}
	
	public static class MRI {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {MRI.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {MRI.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}	
	}

	public static class XRay {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {XRay.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {XRay.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}
	}
	
	public static class BloodTest {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {BloodTest.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {BloodTest.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}
	}
	
	public static class Consultation {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {Consultation.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {Consultation.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}
	}

	public static class TransportationToConsultation {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {TransportationToConsultation.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {TransportationToConsultation.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}
	}
	
	public static class TransportationToExamination {
		private static int time = 2;
		private static int cost = 0;
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
			if(probabilityDistribution.equalsIgnoreCase("Uniform")) {
				return(Simulator.globalClock + ProbabilityDistribution.uniform(int1, int2));
			}
			
			else if(probabilityDistribution.equalsIgnoreCase("Exp")) {
				return(Simulator.globalClock + ProbabilityDistribution.exp(double1));
			}
			
			else {return(Registration.time);
			}
		}
		public String getProbabilityDistribution() {
			return("Probability Distribution is " + probabilityDistribution +
					"\n int1 is " + int1 + "\n int2 is " + int1 + "\n double is " + double1);
		}
		
		public static void setTime(int time) {TransportationToExamination.time = time;}
		public static int getCost() {return cost;}
		public static void setCost(int cost) {TransportationToExamination.cost = cost;}
		public void setProbabilityDistribution() {this.probabilityDistribution = probabilityDistribution;}
		public void setInt1(int int1) {this.int1 = int1;}
		public void setInt2(int int2) {this.int2 = int2;}
		public void setDouble1(double double1) {this.double1 = double1;}
	}
	
	public static class L1 {
		private static String probabilityDistribution = "Uniform";
		private static int int1 = 40;
		private static int int2 = 80;
		private static double double1;
		
		public static int getTime() {
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
		
		public static int getTime() {
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
		
		public static int getTime() {
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
		
		public static int getTime() {
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
		
		public static int getTime() {
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

	public static class Physician {
		private static int number = 1;
		
		public static int getNumber() {return number;}
		public static void setNumber(int number) {Physician.number = number;}
	}
	
	public static class Nurse {
		private static int number = 1;
		
		public static int getNumber() {return number;}
		public static void setNumber(int number) {Nurse.number = number;}
	}
	
	public static class Transporter {
		private static int number = 1;
		
		public static int getNumber() {return number;}
		public static void setNumber(int number) {Transporter.number = number;}
	}
	
	
	public static class Stretcher {
		private static int number = 1;
		
		public static int getNumber() {return number;}
		public static void setNumber(int number) {Stretcher.number = number;}
	}
	
	public static class Wheelchair {
		private static int number = 1;
		
		public static int getNumber() {return number;}
		public static void setNumber(int number) {Wheelchair.number = number;}
	}

	public static class XRayScanner {
		private static int number = 1;
		
		public static int getNumber() {return number;}
		public static void setNumber(int number) {XRayScanner.number = number;}
	}

	public static class BloodTestLaboratory {
		private static int number = 1;
		private static int size = 1;
		
		public static int getSize() {return size;}
		public static void setSize(int size) {BloodTestLaboratory.size = size;}
		public static int getNumber() {return number;}
		public static void setNumber(int number) {BloodTestLaboratory.number = number;}
	}

	public static class BoxRoom {
		private static int number = 1;
		private static int size = 1;
		
		public static int getSize() {return size;}
		public static void setSize(int size) {BoxRoom.size = size;}
		public static int getNumber() {return number;}
		public static void setNumber(int number) {BoxRoom.number = number;}
	}
	
	public static class MRIRoom {
		private static int number = 1;
		private static int size = 1;
		
		public static int getSize() {return size;}
		public static void setSize(int size) {MRIRoom.size = size;}
		public static int getNumber() {return number;}
		public static void setNumber(int number) {MRIRoom.number = number;}
	}
	
	public static class RadiographyRoom {
		private static int number = 1;
		private static int size = 1;
		
		public static int getSize() {return size;}
		public static void setSize(int size) {RadiographyRoom.size = size;}
		public static int getNumber() {return number;}
		public static void setNumber(int number) {RadiographyRoom.number = number;}
	}
	
	public static class ShockRoom {
		private static int number = 1;
		private static int size = 1;
		
		public static int getSize() {return size;}
		public static void setSize(int size) {ShockRoom.size = size;}
		public static int getNumber() {return number;}
		public static void setNumber(int number) {ShockRoom.number = number;}
	}
	

}
