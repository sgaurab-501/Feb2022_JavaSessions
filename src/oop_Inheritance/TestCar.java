package oop_Inheritance;

public class TestCar {

final static String name = "Ashish";
	
	public static void main(String[] args) {

//	TestCar.name = "Ramesh";

		
	final int days = 7; // constant variable
	System.out.println("Salary = "+days*10);
	
	BMW b = new BMW();
	b.start(); // Overriden
	b.stop(); // Inherited
	b.refuel(); // Inherited
	b.autoParking(); // Individual
    b.engine(); // Inherited
    BMW.seating();
	System.out.println(b.speed);
    System.out.println(BMW.wheels);
//    BMW.wheels = 6;
    
	Car c = new Car();
	c.start();
	c.stop();
	c.engine();

	
 // Top casting or up casting 
// Child class object can be referred by Parent class reference variable	
  Car c1 = new BMW();
	c1.start();
	c1.stop();
	c1.refuel();
	c1.engine();
//c1.autoParking() // Reference type check will be failed
	
// Down casting
// Parent class object can be referred by a child class reference variable
// Down casting may not give any error at compile but it is not allowed at run time
	
//  BMW b1 = (BMW) new Car(); // ClassCastException

  Vehicle v1 = new BMW();
  v1.engine(); // Individual 
  
  Audi au = new Audi();
  au.start();
  au.stop();
  au.theftSafety();
  au.engine();
  au.seating(); // Inherited method
  
  Car c2 = new Audi();
  c2.engine();
  
	}
}
