package oop_Interface;

public interface USMedical extends WHO, UNHG {

	int min_fee = 100;
	
// Interface variables are static and final in nature by default
// Cannot have a method body: an abstract method
// Only method declaration is allowed
// Only method prototype
// no business logic
// Cannot create the object of an interface
// Abstract method cannot be static
	
	public void physioServices();
	public void cardioServices();
	public void pediaServices();
	public void emergencyServices();
	
	
	public void covidGuidelines();
	
	
// After jdk 1.8 two major changes 

//1. Can have static method with a method body
	
	
	public static void billing() {
	
	System.out.println("US Medical --- billing...");
	}

//2. Can have a default method in the Interface
	
	default void medNews() {
		
	System.out.println("USMedical -- medNews");
	}
	
	
	
	
	
}
