//Saliot, Regine Joy Dorothy L. 
//BSIT1IT1
//Module1 Assessment 

//package Product2;   // Gi comment lang nako ang package maam para mu run sa imong IDE
/*
import Product1.Books;
import Product1.Electronics;
import Product1.Product;
*/
public class ProductTester {

	public static void main(String[] args) {
		
		
		try {
		Product [] product  = new Product[5];
		
		product[0] = new TV(1000.0, "Sony", 13.9);
		product[1] = new Electronics(2000.0, "Sharp");
		product[2] = new MP3(250.0, "Sony", "Pink");
		product[3] = new Books(150.0,"The Notebook"); 
		product[4] = new Books(200.0,"Tuesdays With Morrie"); 
		
		
		 
		 
		for (int i =0; i < product.length; i++) {
			
			System.out.println(" Item Number   : "  + (i+1));
			System.out.println(" Type          : "  +  product[i].getClass().getSimpleName());
			System.out.println(" Regular Price : "  +  product[i].getRegularPrice());
			System.out.println(" Sale Price    : "  +  product[i].computeSalePrice());
			System.out.println(); 
			
			
		}
		double totalRegularPrice , totalSalePrice; 
		totalRegularPrice = product[0].getRegularPrice() + 
							product[1].getRegularPrice() + 
							product[2].getRegularPrice() + 
							product[3].getRegularPrice() +
							product[4].getRegularPrice();
							
		totalSalePrice = 	product[0].computeSalePrice() + 
							product[1].computeSalePrice() + 
							product[2].computeSalePrice() + 
							product[3].computeSalePrice() +
							product[4].computeSalePrice() ;			
							
							
							
		
		System.out.println("Total Regular Price   : " + totalRegularPrice  );
		System.out.println("Total Sale Price      : " + totalSalePrice );
		
		}catch(Exception e) {
			System.out.println("Error");
		
			}
		}
	
	}	
		
	
	

	
	

	
		
	
	

