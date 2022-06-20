package oop_Encapsulation;

public class Browser {

// One non static method can call another non static method without creating any object	
public void launchBrowser() {

	System.out.println("Launching Chrome.....");
	checkRAM();
	checkOSVersion();
	chromeServices();
	System.out.println("Chrome is launched....");
	
}

private void checkRAM() {
	
System.out.println("Check RAM");
}
	
private void checkOSVersion() {
	
System.out.println("Check OS");	
	}
	
private void chromeServices() {
		
System.out.println("Check update chrome services.....");
	}
}
