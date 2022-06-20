package javaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//mandatory to define the type of data

/* 1. Primitive data types
		


 
		

		
		
		
*/

// 1. byte
// size: 1x8 bits	
// range: -128 to 127		
byte b = 10;
b = 20;
System.out.println(b);
		
//2. short
//size: 2 bytes = 2x8 = 16 bits	
//range: 	





//3. int 
//size: 4 bytes = 4x8 = 32 bits	
//range: 		





//4. long
//size: 8 bytes = 8x8 = 64 bits	
//range: 		





//5. float
//size: 4x8 = 32 bits	
//range: 		

float f1 = 12.33f;
float f2 = (float)34.55;
System.out.println(f2);




//6. double
//size: 8 bytes = 8x8 = 64 bits	
//range: -128 to 127		
double d1 = 12.33;
double d2 = 100;
System.out.println(d2);



//7. char: single quote and single digit value 
char c1 = '1';
char c2 = 'a';
char c3 = '$';
char c22 = 'b';
char c4 = 'C';
char c5 = ' ';

// a-z --> 97 to 122
// A-Z --> 65 to 90
// 0-9 --> 48 to 57
System.out.println(c2+c22);//195
System.out.println(c22);//b
System.out.println((int)c22);
System.out.println((short)c22);
System.out.println((float)c22);

//8. boolean
// size ~1 bit
boolean flag = true;
boolean fg = false;
boolean isActive = true;

System.out.println(10+20);
System.out.println(20-10);
System.out.println(10*20);
System.out.println(20/10);
System.out.println(isActive);

//System.out.println(9/0);//AArithmetic exception

System.out.println(0/9);// integer divided by 0
System.out.println(9.0/0);
System.out.println(9/0.0);// Infinity as 0.0 is a decimal number
//System.out.println(0/0);// Arithmetic exception
System.out.println(0.0/0);//NaN - not a number
System.out.println(0.0/0.0);//NaN

System.out.println(9/2);//4
System.out.println(9.0/2);//4.5
System.out.println(9/2.0);//4.5
System.out.println(9.0/2.0);//4.5

System.out.println(9%2);//1
System.out.println(8%2);//0
System.out.println(100%3);//1

// 2. Non Primitive data types
		
		
		
		
	}

}
