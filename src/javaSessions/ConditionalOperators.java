package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a > b);

		if (a > b) {

			System.out.println("a is greater than b");
		}

		else {

			System.out.println("b is greater than a");

		}
		if (true) {
			System.out.println("Hi");

		} else {
			System.out.println("Bye");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("JAVA");
		}

		else {
			System.out.println("Python");
		}

		int marks = 97;
		if (marks <= 100) {
//	System.out.println("A Grade");	 

			if (marks >= 95) {

				System.out.println("A++ Grade");

			} else {

				if (marks <= 30) {
					System.out.println("Fail");
				} else {
					System.out.println("A Grade");
				}

			}

		}

		else {
			System.out.println("Wrong Marks");

		}
int p=10;
int q=10;
if(p==q) {
System.out.println("Hello");
}
 /* if - if - if
String name = "Tom";
if(name.equals("Harsh"))
{
System.out.println("100 Marks");	

}
if(name.equals("Vicky")) {		
System.out.println("90 Marks");		
	}
	
if(name.equals("Ravi")) {
	System.out.println("80 Marks");
}

if(name.equals("Naveen")) {
	System.out.println("10 Marks");
}

else {
	System.out.println("Student not found....");
}
*/
String name = "Ravi";
if(name.equals("Harsh"))
{
System.out.println("100 Marks");	

}
else if(name.equals("Vicky")) {		
System.out.println("90 Marks");		
	}
	
else if(name.equals("Ravi")) {
	System.out.println("80 Marks");
}

else if(name.equals("Naveen")) {
	System.out.println("10 Marks");
}

else {
	System.out.println("Student not found....");
}



}}
	
	
	
