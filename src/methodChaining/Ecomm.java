package methodChaining;

public class Ecomm {

	
	public Ecomm login() {
		System.out.println("Default login....");
		return this;
	}
	public Ecomm login(String un, String  pwd) {
	System.out.println("Login with: "+" "+un+" "+pwd);	
	return this;
	}
	
	public Ecomm doSearch(String name) {
	System.out.println("Searching.... "+name);	
	return this;
	}
	
	public Ecomm doSearch(String name, int price) {
	System.out.println("Searching.... "+name+" "+price);	
	return this;
	}
	
	public Ecomm addToCart(String name) {
	System.out.println("Add to Cart: "+name);
	return this;
	}
	
	public Ecomm doPayment(String upi) {
	System.out.println("Pay by: "+upi);	
	return this;	
	}
	
	public Ecomm doPayment(String cc, int otp) {	
	System.out.println("Pay by: "+cc+" "+otp );
	return this;
	}
	
	public Ecomm getOrderId() {
	System.out.println("Order Id is: "+12345);
	return this;
	}
	
	public Ecomm logout() {
	System.out.println("Logout....");
	return this;
	}
}
