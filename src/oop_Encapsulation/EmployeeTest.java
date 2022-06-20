package oop_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
	
//POST: Create the data for first time 
	Employee e1 = new Employee("Tom", 30, 12.33);
//	e1.setName("Tom");
	String s = e1.getName();
	System.out.println(s);
	
// e1.setAge(30);
	int a = e1.getAge();
	System.out.println(a);
	
//	e1.setSalary(12.33);
	double d = e1.getSalary();
	System.out.println(d);
	
//UPDATE: PUT
e1.setName("Ram");
e1.setAge(28);
e1.setSalary(31.45);

System.out.println(e1.getName());
System.out.println(e1.getAge());
System.out.println(e1.getSalary());

System.out.println(e1.getEmpInfo());	
	
	}
}
