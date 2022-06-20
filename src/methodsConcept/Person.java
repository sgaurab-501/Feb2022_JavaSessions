package methodsConcept;

public class Person {

	int x;
	int y;
	
	public int sum(int a, int b) {
	
	int z = a+b;
	return z;
	}
	
	public void getInfo(Person p) {
		
	System.out.println(p.x);
	System.out.println(p.y);
	p.x=30;
	p.y=40;
	
	}
	
	
  public void sum() {
	System.out.println("Bye....."+100);
  }
	
	
	public static void main(String[] args) {
	
	Person obj = new Person();	
// obj.sum(10, 20); // Call by value or Call by arguments
	obj.x=10;
	obj.y=20;
	obj.sum(10, 20);// Call by value: method overloading: compile time polymorphism
	
	obj.getInfo(obj);
	System.out.println(obj.x);
	System.out.println(obj.y);
	}
	 
	
	
}
