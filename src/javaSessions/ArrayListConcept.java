package javaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
	//ArrayList: Default class
	//Index or Order based collection
// Default virtual capacity of Array list is 10
	
		
	ArrayList ar = new ArrayList();
	System.out.println(ar.size());//0
	
	ar.add(100);//0
	ar.add(200);//1
  System.out.println(ar.size());//2		
	
	ar.add(300);
	ar.add(400);
  System.out.println(ar.size());
System.out.println(ar.get(0));
System.out.println(ar.get(3));
ar.add(500);
System.out.println(ar.get(4));//IndexOutOfBoundsException
 ar.add(0, 1100);
 //ar.add(8, 1500);//IndexOutOfBoundsException: Java always starts filling in the continuous memory allocation
 
 System.out.println(ar.get(7));
 
 System.out.println(ar.get(0));
 
ArrayList pr = new ArrayList(20);
	//pc=20   vc=0
// 20th index value, vc=20/2=10
//pc=30, vc=30/2=15
//pc=45, vc=45/2=22
 



	}
	
	
	
	
	
}
