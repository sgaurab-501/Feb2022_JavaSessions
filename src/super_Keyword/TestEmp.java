package super_Keyword;

public class TestEmp {

public static void main(String[] args) {
	
	Employee e = new Employee();
	Employee e1 = new Employee(10);
	Employee e2 = new Employee(10,20);
	
//	System.out.println(e.salary);

	e.getSalary();
	e.holiday();
	
	
}	
}
