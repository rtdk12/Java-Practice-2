//package Product1;
//  gi comment lang nako ang package maam para mu run sa imong IDE
public class Electronics extends Product{ 
	
	

	//attributes
	
	private String manufacturer;
	
	
	//constructor 
	
	public Electronics(double regularPrice, String manufacturer) {
		super(regularPrice);
		this.manufacturer = manufacturer;
		
	}
     
	
	//setters and getters  
	 
	public String getManufacturer() {  
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	//methods
	
	public double computeSalePrice() {
		return   super.getRegularPrice() * 0.6 ;
		 
	}
	
	 
	   
	
	    
	
	
}
