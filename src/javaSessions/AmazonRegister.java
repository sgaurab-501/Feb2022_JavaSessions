package javaSessions;

import p2.Person;

public class AmazonRegister {
	
public static void main(String[] args) {
	
	Register reg = new Register();
	reg.name ="Tom";
	reg.gender='M';
	
	reg.name="Peter";
	System.out.println(reg.name);
	
	Register reg1 = new Register();
	reg1.name="Tom";
	System.out.println(reg1.name);
	
	System.out.println(reg1.gender);//Blank space
	
	Employee e1 = new Employee();
	e1.name="Naveen";
	
	Person p1 = new Person();

	
}
}
