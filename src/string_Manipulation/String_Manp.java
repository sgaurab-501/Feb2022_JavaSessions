package string_Manipulation;

public class String_Manp {

// String is an array of characters
	
public static void main(String[] args) {
	
	String s = "hi this is java";  
    
	System.out.println(s.length());
    System.out.println("li: "+0); // 0 is always the first index
    System.out.println("hi: "+(s.length()-1));

      System.out.println(s.charAt(14));
//    System.out.println(s.charAt(-1)); //StringIndexOutOfBoundsException
//    System.out.println(s.charAt(15));  // SIOB

      System.out.println(s.indexOf('t'));
      System.out.println(s.indexOf('i')); // 1st occurrence of i
 //     System.out.println(s.indexOf('i', 2)); // 2nd occurrence of i
   System.out.println(s.indexOf('i', s.indexOf('i')+1));   
   System.out.println(s.indexOf('i', s.indexOf('i', s.indexOf('i')+1)+1));
   
   System.out.println(s.indexOf("this")); // first index of beginning of the string
  
   String msg = "admin welcome";
   if(msg.indexOf("admin")>=0) {
	   
	 System.out.println("admin is present...");  
   }
   
   else {
	 System.out.println("admin is not present...");
   }

// contains:
   
   String m = "welcome to app world";
  
   System.out.println(m.contains("welcome"));

   if (m.contains("app")) {
	System.out.println("test is passed");
} else {
System.out.println("test is failed");
}
   
   //equals
  String s1 = "welcome selenium"; 
  String s2 = "welcome selenium";
   
  System.out.println(s1.equals(s2));
  System.out.println(s1.equalsIgnoreCase(s2));

  String s3 = new String("welcome selenium");
  System.out.println(s1==s2);
  System.out.println(s1==s3);
}

}
