package javaSessions;
//blueprint/template/category of objects

public class Employee {

	String name;
	int age;
	String city;
    double salary;
    boolean isActive;
    
	public static void main(String[] args) {
		
 Employee e1 = new Employee();
 e1.name = "Tom";
 e1.age=27;
 e1.salary=25000;
 e1.city="Jaipur";

 System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
	
Employee e2 = new Employee();

e2.name="Deepa";

System.out.println(e2.name);
System.out.println(e2.age);
System.out.println(e2.salary);
System.out.println(e2.city);
		
Employee e3 = new Employee();
System.out.println(e3.isActive);// default value of boolean - false
	
//Employee e4 = new Employee();
//e4 = null;
//e4.name="Lisa";
//System.out.println(e4.name);//NullPointerException

new Employee().name = "Mohan";// No Reference object// No variable to refer to this object
new Employee().age=30;
	
	
	
	
}
}