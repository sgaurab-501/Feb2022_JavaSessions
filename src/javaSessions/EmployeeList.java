package javaSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {

 public static void main(String[] args) {
	
	ArrayList ar = new ArrayList(5);
  //vc=10  pc=0
System.out.println(ar.size());	

	 ar.add(100);//0
	 ar.add("hello");//1
	 ar.add(true);//2
	 ar.add('a');//3
	 ar.add(12.33);
	
//Lowest index=0
//Highest index=size()-1
	 
System.out.println("li="+0);
System.out.println("length="+ar.size());
System.out.println("hi="+(ar.size()-1));
	 
ar.add(500);//4
System.out.println("length="+ar.size());
System.out.println("hi="+(ar.size()-1));

ar.add(600);//5
System.out.println("length="+ar.size());

ar.add(700);//6
System.out.println("length="+ar.size());

ar.add(800);//7
System.out.println("--------------------------");

//Print all the values from ArrayList: Using loop

for(int i=0;i<ar.size();i++) {
	
	System.out.println(ar.get(i));

}
System.out.println(ar);

System.out.println("--------------------------");

ArrayList<Integer> marksList = new ArrayList<Integer>();

marksList.add(100);//0
marksList.add(200);//1
marksList.add(122);//2
System.out.println(marksList.size());

for(int i=0; i<marksList.size();i++) {
	
	System.out.println(marksList.get(i));
 
}
System.out.println(marksList);

System.out.println("--------------------------");
System.out.println("For each loop");
for(Integer e: marksList) {
	System.out.println(e);
	
}
//Double ArrayList
ArrayList<Double> bmilist = new ArrayList<Double>();
 
//String ArrayList
ArrayList<String> prodlist = new ArrayList<String>();

prodlist.add("apple");
prodlist.add("orange");
prodlist.add("strawberry");

System.out.println(prodlist.size());

for(String e:prodlist) {
	System.out.println(e);

}

System.out.println("--------------------------");

//Emp Info: Object type ArrayList

ArrayList<Object> empInfo = new ArrayList<Object>();

empInfo.add("Ram");//0
empInfo.add(28);//1
empInfo.add(35000);//2
empInfo.add('M');//3
empInfo.add(true);//4
System.out.println(empInfo);

for(int i=0; i<empInfo.size();i++) {
	System.out.println(empInfo.get(i));
	if(empInfo.get(i).equals(true)) {
	System.out.println("Move to US");
	
	}
	
}
System.out.println("--------------------------");
for(Object b:empInfo) {
	System.out.println(b);
	
}


}}
