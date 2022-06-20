package javaSessions;

public class Car {

	String name; // Global variable
	int price;
	String licNumber;
	String colour;
   static int wheels=4; // Common Memory allocation
// Permanent Generation / Metaspace
 // Dynamic Memory  
  
public static void main(String[] args) {
	
	String name; //local variable
//  System.out.println(name);
	
	Car.wheels=5;
	
	Car c1 = new Car();
	System.out.println(c1.name);//null
	c1.name="BMW";
	c1.price=50;
	c1.colour="Blue";
	System.out.println(c1.name);//BMW - line by line execution
	c1.licNumber="123456";
	System.out.println(c1.licNumber);
	
	Car c2 = new Car();
	c2.name="Mercedez";
	c2.price=55;
	c2.colour="Black";
	

	Car c3 = new Car();
	c3.name="Audi";
	c3.price=40;
	c3.colour="Black";
	

	Car c4 = new Car();
	c4.name="Honda";
	c4.price=45;
	c4.colour="Red";
	
System.out.println(c1.name+" "+c1.price+" "+c1.colour);
System.out.println(Car.wheels);



}
}
