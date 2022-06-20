package javaSessions;

public class TimeComplexity {

  public static void main(String[] args) {
	
 int i=10;
 System.out.println(i);
	  
//Big O --> O(1) --- Constant time
 
 for(int p=0;p<=10;p++) {
	 
 
 System.out.println(p);

 //1+n+n+n --> 3n+1 (linear equation)
 // 3n+1 --> 3n --> O(n)
 
 for(int n=0;p<=10;n++) {
	 for(int m=0;m<=10;m++) {
		 
	//(1+n)(1+n+n) --> 1+2n+6n^2+3n --> 6n^2+5n+1
	//n(6n+5) --> 6n^2 --> O(n^2) --> More time 
		 
	 }
 }
 
 
 
 
 }	  
	  
}}
