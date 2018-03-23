package core;

public class Insurance {
	private String type;
	
	@Override
	public String toString() {
		return "Insurance [type=" + type + "]";
	}
	public int discount() {
		if (this.type.equals("no insurance")){return(0);}
		if (this.type.equals("silver")) {return(50);}
		if (this.type.equals("gold")) {return(80);}
		else {return(-1);}
		//TODO faire une exception si c'est aucun des trois
	}
	//random constructor
	public Insurance() {
		int i = ProbabilityDistribution.uniform(0,2);
		if(i==0) {this.type = "no insurance";}
		if (i==1) {this.type = "silver";}
		if (i==2) {this.type = "gold";}
	}
}
