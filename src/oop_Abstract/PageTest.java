package oop_Abstract;

public class PageTest {

public static void main(String[] args) {
	
	LoginPage lp = new LoginPage();
	lp.url();
	lp.title();
	lp.header();
	lp.doLogin();
	lp.logo();
	
//	Page p = new Page();
    
	Page p = new LoginPage();
    p.header();
    p.url();
    p.timeout();
  
 // Down casting is not allowed 
    
    LoginPage lp1 = new LoginPage(10);
    
    
   

}
	
	
}
