package oop_Abstract;

public abstract class Page {

int time = 10;
// 0 to 100% abstraction
// 100% abstraction -- only abstract methods
// partial abstraction
// 0% abstraction
//abstract class object cannot be created
//but constructor can be created

	public abstract void title();
	public abstract void url();
	public abstract void header();
	
	public void timeout() { // non-abstract method with method body
		
	}
	
	public void timeOut() { // non-abstract method with method body
		
	System.out.println("Page - timeout 20 sec");
	}
	
	public Page() {

	System.out.println("Page const.....");
	}
   
	public final void logo() {
	
	System.out.println("Page logo");	
	}

 public Page(int a) {
	System.out.println("Page const..."+a);
 }
}
