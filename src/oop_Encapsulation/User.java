package oop_Encapsulation;

public class User {

	public static void main(String[] args) {
	
		Amazon seller = new Amazon("seller@gmail.com", "seller@123");
		seller.doLogin();
		
		seller.setPassword("seller123456");
	    seller.doLogin();
	    seller.logout();
	    
	    Amazon user = new Amazon("user@gmail.com", "user@123");
        user.doLogin();
        user.logout();  	
	
	}
}
