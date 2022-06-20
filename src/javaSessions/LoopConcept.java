package javaSessions;

public class LoopConcept {

	public static void main(String[] args) {
		
	
	//1. while loop
    // 1 to 10 
	
	int i =1;
	while(i<=10)
	{
		System.out.println(i);
	//	i++;
		++i;
	}

	System.out.println("----------------------");
	int p =1;
	while(p<=100)
	{
	if (p%5==0) {
	System.out.println("Hi....");	
	break;
	
	}
	p++;
	}
	
System.out.println("------------------------------");	
	
boolean flag = false; 
while(flag)
{
	System.out.println("Welcome to Taj Hotel");
	
}

// Use cases of while loop -- When we are not sure of the no. of iterations 

// 1. lazy loading: LinkedIn, Swiggy, FB
// 2. Pagination: 1,2,3,4,5,6........100
// 3. Page loading: 10s, 20s, 30s etc.
// 4. Element is getting displayed on page : 10, 20, 30, 40
// 5. Carousel Handling-- Product sliding buttons on eCommerce page
// 6. Calendar Handling

// 2. For loop -- when we are sure about the no. of iterations

// 1 to 10

int a=1;
for( ;a<=10;)
{
	System.out.println(a); // 1,2,3,4 ......10
	//a++;
	a=a+1;
	
}

//0 2 4 6 8 

for(int even=0; even<=10; even=even+2)
{

	
	System.out.println(even);

}

// 1 3 5 7 9

for(int odd=0;odd<=10; odd++)
{
//	if(!(odd%2==0))
	if(odd%2!=0)
	{
	
	System.out.println(odd);	
	}
	
	
	
}


for(;true;)
{
	System.out.println("Bye");
	break;
}

for(; ;)
{
	
System.out.println("Bye");
break;

}
System.out.println("---------------------------------");

for(double d=1.1; d<=10.1;d++) {
	System.out.println(d);
	
}
System.out.println("---------------------------------");

for(byte b=1; b<=10;b++)
{
	System.out.println(b);
}
System.out.println("---------------------------------");
for(char c='a'; c<='z';c++) {
	System.out.println(c);
}
System.out.println("---------------------------------");
for(char ch='a';ch<='z';ch++) {
	System.out.println(ch+":"+(int)ch);
}
System.out.println("---------------------------------");

for(char c1='A';c1<='Z';c1++) {
	System.out.println(c1+":"+(int)c1);
	
}
System.out.println("---------------------------------");
for(char c2='a';c2<='z';c2++) {
	System.out.println(c2+0);
	
	}
System.out.println("---------------------------------");
// Use cases: 
// Dropdown - 10 values
// Total links: 100 - text of each link
// Suggestion list: google search, amazon search

//3. Do-while loop

int k=1;
do {
	k++;
  System.out.println(k);// 2,3,4,5,6,7,8,9,10,11
//break;
} while (k<=10);

// Use cases:
//1. If element is immediately present on the page or not



}}
