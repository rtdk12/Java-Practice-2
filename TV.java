//package Product2;

//import Product1.Electronics;    //  gi comment lang nako ang package maam par amu run sa imong IDE

public class TV extends Electronics{

	//attributes
	private double size; 
	
	
	//constructor
	
	public TV(double regularPrice, String manufacturer, double size) {
		super(regularPrice, manufacturer);
		this.size = size;
	}

	
	//setters and getters
	
	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}
	
	
	//methods
	
	public double computeSalePrice() {
		return   super.getRegularPrice() * 0.8 ;
	}
	
	
	
	
	
	
	
	
	

}
