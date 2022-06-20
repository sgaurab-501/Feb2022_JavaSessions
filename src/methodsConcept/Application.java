package methodsConcept;

public class Application {

// data members: class variables + function
// Cannot create a function inside another function
// Function cannot be duplicate

//1. No input and no return
// void: does not return anything
	

public void test() {
	System.out.println("Test Method.......");
}
	
public void addition() {
	
	int a =10;
	int b=20;
	int c=a+b;
   System.out.println(c);		
}
//2. No input and some return	
public String getName() {
	System.out.println("Get Name method.....");
	String name="Tom";
	return name;
}
 public int getSum() {
	System.out.println("Get sum method....");
	int a=10;
	int b=20;
	int sum=a+b;
	return sum;
	
 }
//3. Some input and some return

 public int add(int x, int y) {// 2 parameter function
  
 int z = x+y;
 return z;
	 
 }
 
 //WAF : Input ---> StudentName (String)
 // return: marks of the student (int)
 public int getMarks(String studentName) {
	 
  System.out.println("Getting marks for Student: "+studentName);
 
  
  if(studentName.equals("Manisha")) {
	 return 90;
 }
  
  if(studentName.equals("Deepa")) {
	  return 95;
  }
  else {
	System.out.println("Student: "+studentName+" "+"not found");  
	  return -1;
  }
 }

 public int getSMarks(String studentName) {
	 
	  System.out.println("Getting marks for Student: "+studentName);
	 int marks;
	  
	  if(studentName.equals("Manisha")) {
		 marks= 90;
	 }
	  
	  if(studentName.equals("Deepa")) {
		  marks= 95;
	  }
	  else {
		System.out.println("Student: "+studentName+" "+"not found");  
		 marks=-1;
	  }
	  return marks;
	 }

 
 
 
	public static void main(String[] args) {
 
    Application app = new Application();
    app.test(); // calling a function
    app.addition();
    
	String n=app.getName();		
	System.out.println(n);	
//	System.out.println(app.getName());	
		
	int k=app.getSum();
	System.out.println(k+5-1);
	
	int m =app.add(20, 30);// 2 arguments
	System.out.println(m);
	
//	int l = app.getMarks("Deepa");
//	if(l==-1)
//	{
//	System.out.println("Don't print the marksheet");	
//	}
//	else {
//	System.out.println(l);
//	}

int j=app.getSMarks("Deepa");	
if(j==-1)
{
System.out.println("Don't print the marksheet");	
}
else {
System.out.println(j);

}	
	}
}
