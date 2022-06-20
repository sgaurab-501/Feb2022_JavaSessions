package javaSessions;

public class SwitchCaseConcept {

public static void main(String[] args) {
	
// Only int and String values can be used in switch case	
String name = "Tom";	

//break can be used only inside a loop or switch case

switch (name) {
case "Harsh":
	System.out.println("100 Marks");
	break;
case "Ravi":
	System.out.println("100 Marks");
	break;
case "Naveen":
	System.out.println("100 Marks");
	break;	
case "Vicky":
	System.out.println("100 Marks");
	break;	
	
default:
System.out.println("Student is not found: " +name);
	break;
}	
	
	int marks = 10;
	
	switch (marks) {
	
	case 90:
	System.out.println("Science");
		break;
	case 80:
		System.out.println("Commerce");
			break;
	case 70:
		System.out.println("Arts");
			break;	

	default:
	System.out.println("Failed....");	
		break;
	}
	
	char ch = 'A';
	switch (ch) {
	case 'A':
	System.out.println("First option");
		break;
case 'B':
	System.out.println("Second option");	
		break;
		
	default:
	System.out.println("No option");	
		break;
	}
	
String browser = " CHR OME ";
	
switch (browser.toLowerCase().replace(" ", "")) {
case "chrome":
System.out.println("launch chrome");
	break;
case "firefox":
	System.out.println("launch firefox");
	break;
	
case "ie":
	System.out.println("launch ie");
	break;
	
case "safari":
	System.out.println("launch safari");
	break;
default:
	System.out.println("Please enter the right browser: "+browser);
	break;
}
	
	

//	test environment
//	DEV, QA, UAT, STAGE, PQA, PROD
//	Switch case
//	if else if
	
	
// State (key)	
// Cases: KA, MH, Delhi
// Total corona cases'

// Value from dropdown (key)
//

String emp = "Tom";
int salary = 0;

switch (emp) {
case "Naveen":
	salary = 20;
	System.out.println("Salary: "+salary);
	break;
case "Ravi":
	salary = 30;
	System.out.println("Salary: "+salary);
	break;
case "Mohan":
	salary = 50;
	System.out.println("Salary: "+salary);
	break;	
case "Vicky":
	salary = 40;
	System.out.println("Salary: "+salary);
	break;	
	
default:
	System.out.println("emp is not found....");
	break;
}
	System.out.println("emp: "+emp+" "+"having salary: "+salary);
	
	
	
}
}