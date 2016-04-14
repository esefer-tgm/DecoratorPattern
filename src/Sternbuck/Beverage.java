package Sternbuck;

public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
	
	//public void setDescripton(String descripton) {
		//this.descripton = descripton;
	//}
	
	
}
