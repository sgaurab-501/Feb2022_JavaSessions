package javaSessions;

public class User {
String name;
int age;
String city;
	
	public static void main(String[] args) {
	
	User u1 = new User();
	u1.name="Harsh";
	u1.age=20;
	u1.city="Delhi";
	
	User u2 = new User();
	u2.name="Ravi";
	u2.age=26;
	u2.city="Indore";
	
	User u3 = new User();
	u3.name="Suresh";
	u3.age=24;
	u3.city="Bhopal";
	
System.out.println(u1.name+" "+u1.age+" "+u1.city);	
System.out.println(u2.name+" "+u2.age+" "+u2.city);
System.out.println(u3.name+" "+u3.age+" "+u3.city);
	
System.out.println("-------------------------------");
u1=u2;
System.out.println(u1.name+" "+u1.age+" "+u1.city);	
System.out.println(u2.name+" "+u2.age+" "+u2.city);
System.out.println(u3.name+" "+u3.age+" "+u3.city);

System.out.println("-------------------------------");
u2=u3;
System.out.println(u1.name+" "+u1.age+" "+u1.city);	
System.out.println(u2.name+" "+u2.age+" "+u2.city);
System.out.println(u3.name+" "+u3.age+" "+u3.city);

System.out.println("-------------------------------");
u3=u1;
System.out.println(u1.name+" "+u1.age+" "+u1.city);	
System.out.println(u2.name+" "+u2.age+" "+u2.city);
System.out.println(u3.name+" "+u3.age+" "+u3.city);



	}
}
// One object with multiple references
// Single reference for single object
// No reference object
// Null reference object
// Multi reference object

