package methodsConcept;

public class Browser {

//WAF : launch the browser: chrome, firefox, safari, ie	
//function name: launchBrowser(String browserName)
// return: true/false (boolean)		
	
	public boolean launchBrowser(String browserName) {
	boolean flag = false;
	System.out.println("Launching the Browser: "+browserName);
	
	switch (browserName.toLowerCase()) {
	
	case "chrome":	
	System.out.println("Launching chrome.....");	
	flag= true;
    break;
    
	case "firefox":
	System.out.println("Launching Firefox....");		
	flag= true;
	break;
	
	case "safari":
	System.out.println("Launching Safari.....");	
	flag= true;
	break;
	
	case "ie":	
	System.out.println("Launching Internet Explorer.....");		
	flag= true;
	break;
	
	default:
	System.out.println("Incorrect browser name....."+browserName);
	flag=false;
	break;
	}
	
	return flag;
	}
	public static void main(String[] args) {	
		
	Browser br = new Browser();
	boolean b = br.launchBrowser("ie");
	
	if(b) {
	System.out.println("https://www.amazon.in/");
	}
	
	System.out.println(b);
	
	}
}
