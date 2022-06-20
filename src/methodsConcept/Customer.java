package methodsConcept;

public class Customer {

 String name;
 int age;
 static String url = "http://www.amazon.com";

 public static void shareInfo() {
	System.out.println("Share info......."); 
	 
 }
	
 public void sendMail() {
System.out.println("Send mail........");
	 
 }
 
	public static void main(String[] args) {
		
	//1. non static stuff(variables + methods)
	// create object	

    Customer obj = new Customer();
    obj.name = "Rita";
	obj.age=20;
	
	System.out.println(obj.name);
	System.out.println(obj.age);
// System.out.println(obj.url);
//	obj.shareInfo();
	
//2. Static stuff (variables + methods)	
//a. call by class name	
	
	System.out.println(Customer.url);
	Customer.shareInfo();
	obj.shareInfo();
	
//b. call variables + methods directly
	
	System.out.println(url);
	shareInfo();	
	
	}
}
