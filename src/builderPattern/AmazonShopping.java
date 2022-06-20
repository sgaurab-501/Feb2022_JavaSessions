package builderPattern;

import methodChaining.Ecomm;

public class AmazonShopping {

	
public static void main(String[] args) {
	
	Ecomm e1 = new Ecomm();
	
	e1.login("customer@gmail.com", "customer@123")
	.doSearch("Shirt")
     .addToCart("Shirt")
     .doPayment("123456@upi")
      .getOrderId()
       .logout();
	
//
	e1.login("customer1@gmail.com", "customer@145")
	 .doSearch("Watch", 2000)
	.logout();
	
//	
	e1.login("customer2@gmail.com", "customer@105")
	.doSearch("Mobile", 7000)
	.logout();
	
//
	e1.login("customer1@gmail.com", "customer@145")
	.addToCart("Watch")
	.doPayment("441", 123456)
   .getOrderId()
	.logout();
	
//
	
	e1.login("customer@gmail.com", "customer@123")
	.logout();
	
	
	
}	 
}
