//package Product1;
// gi comment lang nako ang package maam para mu run sa imong IDE

public class Books extends Product {



	//attributes
	private String title;  
	
	
	
	//constructor
	
	public Books(double regularPrice, String title) {
		super(regularPrice);
		this.title = title;
	}



	
	
	//setters and getters
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}
	
	
	


	
	
	public double computeSalePrice() {
		return   super.getRegularPrice() *  0.5  ;
	}
	
	
	
}
