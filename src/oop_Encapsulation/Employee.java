package oop_Encapsulation;

// POJO: Plain old java object
public class Employee {

private String name;
private int age;
private double salary;

	public Employee(String name, int age, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}

//	public static void main(String[] args) {
//	Employee e1 = new Employee();
//	e1.name="Tom";
//	e1.age=20;
//	e1.salary=12.33;
//	
//	}

// getter and setter methods
// setter methods can be avoided also
// getter is necessary
	
	
public String getEmpInfo() {
	
	return name+" "+age+" "+salary;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
