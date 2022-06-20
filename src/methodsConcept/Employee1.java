package methodsConcept;

import java.lang.reflect.Constructor;

// Constructor vs Function
//1. const name is same as the class name but function can have any name
//2. const will be called when you create the object but function will be called using object reference variable
//3. const will help to create the object with class variable, it should not have any business logic but function will contain business logic
//4. const will have same name but function name will follow camel case
//5. const cannot have any return value but function may or may not return any value

public class Employee1 {

	String name;
	int age;
	String id;
	boolean isActive;
	double salary;
	
	public Employee1() { //0 parameters
	
	System.out.println("Default constructor....");	
	}
	public Employee1(int a) {
	System.out.println("1 Parameter constructor...."+a);
	}
	public Employee1(int a, String b) {
	System.out.println("2 Parameter....."+a+" "+b );
	}
	public Employee1(String name, int age) {
	this.name=name;
	this.age=age;
	}
	public Employee1(String name) {
	this.name=name;
	}
	public Employee1(String name, int age, String id) {
	this.name=name;
	this.age=age;
	this.id=id;
	}
	
	public static void main(String[] args) {
	
	Employee1 e = new Employee1("Rajesh");
//	e.name="Ram";
	
	Employee1 e1 = new Employee1("Ram",25);
//	e1.name="Naveen";	
//	e1.age=20;
//	e1.id="101";
	
	Employee1 e2 = new Employee1("Mohan", 28, "101");
	
	System.out.println(e.name+" "+e.age);
    System.out.println(e1.name+" "+e1.age);
	System.out.println(e2.name+" "+e2.age+" "+e2.id);
    
    
	}
}
