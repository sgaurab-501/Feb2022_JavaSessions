package super_Keyword;

public class Employee extends Company{

	int salary = 50;
	
public void holiday() {
	
System.out.println("emp holiday");
super.holiday();   
}

  public void getSalary() {
	System.out.println(salary);
	System.out.println(super.salary);
  }
public Employee() {
super();
System.out.println("emp....");
}

public Employee(int a) {
super(a);
System.out.println("emp..."+a);
}

public Employee(int a, int b) {
super(a,b);
System.out.println("emp..."+a+" "+b);
}

}
