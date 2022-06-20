package oop_Inheritance;


// Method overloading: Compile time polymorphism or static polymorphism
// Method overriding: Run time polymorphism or dynamic polymorphism
// final class cannot be a parent:preventing inheritance
// final method: cannot be overridden 

public class Car extends Vehicle {

//	int speed = 100;

	static final int wheels = 4;
	
public void start() {
	
System.out.println("Car -- Start");
}
public void stop() {
	
System.out.println("Car -- Stop");
}

public void refuel() {

System.out.println("Car -- Refuel");
}

public static void seating() { // static method cannot be overriden but can be overloaded
	System.out.println("Car -- Seating...");
	
}
private void getLicenseNumber() {
	System.out.println("Car -- License:12345");
}
public final void highSpeed() {
	System.out.println("Car -- High Speed");
}

}
