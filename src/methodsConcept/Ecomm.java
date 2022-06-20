package methodsConcept;

import java.util.Arrays;

public class Ecomm {

// method overloading
// when you have different methods in the same class
//1. with same name
//2. different number of parameters
//3. the sequence of parameters

 public int test() { // 0 parameter
	 System.out.println("Hi");
return 100;
 }
 
 public void test(int a) { // 1 parameter
	 System.out.println("Hello "+a);
 }

 public void test(String a) { // 1 parameter
	 System.out.println("Hello "+a);
 }
 public void test(Double a) { // 1 parameter
	 
	System.out.println("Hello "+a);
 }
 
 public void test(int a, int b) { // 1 parameter
	 
	System.out.println("Hello "+a+" "+b);
}
 
 public void test(int a, String b) { // 2 parameter
	 
	System.out.println("Hello "+a+" "+b);
 } 
 
 public void test(String a, int b) { // 2 parameter
	 
	System.out.println("Hello "+a+" "+b);
 } 
 
 
 public void login() {
	 
 }
 
public void login(String un, String pwd) { // 2 parameter
	 
 }

//
public void doSearch() {
}

public void doSearch(String prodName) {
}

public void doSearch(String prodName, int price, String color) {
}

public void doSearch(String prodName, String seller) {
}

//
public void doPayment(String cc, int cvv) {
	
}

public void doPayment(String cc, int cvv, int otp) {
	
}

public void doPayment(String upi) {
}

public void doPayment(String upi, int otp, long ph) {
	
}

//Uber
public void booking(String start, String end) {
	
}

public void booking(String start, String end, String carType) {
	
}

public void booking(String start, String end, String carType, int passengers) {
	
}

public static void main(String[] args) { 
 
	Ecomm obj = new Ecomm();
	int s = obj.test();
	System.out.println(s);
	
	obj.test("Selenium",100);
    obj.booking("Bangalore", "Mysore", "SUV");
    
}
}
