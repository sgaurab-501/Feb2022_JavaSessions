package oop_Inheritance;

public class BMW extends Car{

// Method overriding: Poly + Morphism (Overloading, Overriding)
// When you have a method in parent class as well as in child class with 
// same name and same number of parameters
// same return type
	
	int speed = 200;
//    static int wheels = 5;	
     static final int wheels = 5;
	
	@Override	
public void start() {
	
	System.out.println("BMW -- Start");
}
public void autoParking() {
	
	System.out.println("BMW -- Auto Parking");
}

public static void seating() { // Method hiding: Parent class having static method and same static method
	// inside the child class
	System.out.println("BMW -- Seating");
}
// @Override // private and static methods cannot be overridden
private void getLicenseNumber() {
	System.out.println("Car -- License:12345");
}

//public final void highSpeed() { // Final method cannot be overridden 
//System.out.println("BMW -- High Speed");
//}
}
