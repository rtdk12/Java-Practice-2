//package Product1;     gi comment lang nako ang package maam para mu run sa imong IDE

public class Product { //superclass 

	//attributes
	private double regularPrice;
	
	
	
	//constructor
	public Product(double regularPrice) {
		this.regularPrice = regularPrice;
		
	}

	
	//setters and getters
	
	public double getRegularPrice() {
		return regularPrice;
	}


	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	  
	//methods
	
	public double computeSalePrice() {
		return regularPrice;
	}
	
	
	
	
	
	
	
	
	
	
}
