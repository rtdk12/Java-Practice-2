//package Product2;

//import Product1.Electronics;            gi comment lang nako ang package maam para mu run sa imong IDE

public class MP3 extends Electronics {

	//attributes
	private String color; 
	

	//constructor
	public MP3(double regularPrice, String manufacturer, String color) {
		super(regularPrice, manufacturer);
		this.color = color;
	}


	
	//setters and getters
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	//methods 
	
	public double computeSalePrice() {
		return   super.getRegularPrice() * 0.9 ;
	}
	

	
	
	
	
	
	
	
	

}
