package javaSessions;

import java.util.Arrays;

public class ArrayConcept {

public static void main(String[] args) {

// Limitations of the array
//1. Size is fixed: Static array: We can use ArrayList(Dynamic array)
//2. Stores only similar type of values: We can use object array
	
	
	// 1. int array 
	
int i[] = new int[4];
 i[0]=10;
 i[1]=20;
 i[2]=30;
 i[3]=40;
// i[4]=50;
 
 
 System.out.println("li = "+0);
	int len=i.length;
System.out.println("length ="+len);	
System.out.println("hi = "+(len-1));	
	
System.out.println(i[0]);
System.out.println(i[3]);
//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
//System.out.println(i[-1]); //AIOB
System.out.println(i[0]+i[1]);
System.out.println("-------------------------------");

// To print all the values from array: Iterate the array: Use loop
//Index based loop
for(int j=0;j<4;j++) {
	System.out.println(j+":"+i[j]); // 10 20 30 40
	
}
System.out.println("-------------------------------");

// For each loop or Enhanced For loop
int count=0;
for(int e:i) {
//	System.out.println(e);
	
System.out.println(count+":"+e);
count++;
}
System.out.println("-------------------------------");
// Double array

double d[]=new double[2];
d[0]=12.33;
d[1]=23.44;

for(double e:d) {
	System.out.println(e);

}
System.out.println("-------------------------------");
// Character array 
char c[]=new char[3];
c[0]='a';
c[1]='2';
c[2]='$';

for(char e:c)
{
System.out.println(e);
}
System.out.println("-------------------------------");

// String array 
String name[]=new String[3];

name[0]="Java";
name[1]="Python";
name[2]="C#";

System.out.println(Arrays.toString(name));
for(String e:name) {
	if(e.equalsIgnoreCase("Java")) {
	System.out.println("Java is my fav prog language....");	
	}
	
	System.out.println(e);

}
System.out.println("-------------------------------");

// Object array: Static array: Can store different type of data

Object obj[]=new Object[5];
obj[0]="Ram";
obj[1]=40;
obj[2]=34.55;
obj[3]=true;
obj[4]='M';

for(Object e:obj) {
	System.out.println(e);
}
System.out.println("-------------------------------");

//Array literals:Static array

int a[]= {10,20,30,40,1,2};
System.out.println(a.length);
System.out.println(a[0]);
System.out.println(a[a.length-1]);

for(int e:a) {
	System.out.println(e);
}
System.out.println(Arrays.toString(a));// [10,20,30....]

System.out.println("-------------------------------");
int marks[]=new int[]{10,20,30,40,55};
System.out.println(marks.length);

for(int e:marks) {
System.out.println(e);

}

}}
