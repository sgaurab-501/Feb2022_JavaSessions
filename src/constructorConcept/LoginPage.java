package constructorConcept;

public class LoginPage {

	String username;
	String password;
	
	public LoginPage(String username, String password) {
		
	this.username=username;
	this.password=password;
	
	}
	
	public LoginPage() {
	System.out.println("Default Constructor.....");
	}
	
	public void doLogin() {
	
	System.out.println("Please enter the credentials"+" "+username+" "+password);
	System.out.println("Login successfully done....");
	}
	
	
	public static void main(String[] args) {
	
	LoginPage lp = new LoginPage("admin@gmail.com", "admin123");
	lp.doLogin();
	
	LoginPage lp1 = new LoginPage();
	lp1.doLogin();
	}
	
}
