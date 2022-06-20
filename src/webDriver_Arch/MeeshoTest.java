package webDriver_Arch;

public class MeeshoTest {

WebDriver driver;
String browser;
	
//public MeeshoTest(WebDriver driver, String browser) {
//	this.browser=browser;
//	this.driver=driver;
//}

	public static void main(String[] args) {

//Cross browser: FF, Chrome, Safari	
		
//	ChromeDriver driver = new ChromeDriver();	
//	SafariDriver driver = new SafariDriver();	
    
    WebDriver driver = null;
	String browser = "chrome";
	if(browser.equalsIgnoreCase("chrome"))	{
	 driver = new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("Firefox"))	{
	driver = new FirefoxDriver();
	}
	
	else if(browser.equalsIgnoreCase("chrome"))	{
	driver = new SafariDriver();
	}
	
	else {
	System.out.println("Please pass the browser name");
	}
	
	driver.get("http://www.cashify.com");	
	String title = driver.getTitle();
	String url = driver.getUrl();
    System.out.println(title);
    System.out.println(url);
	
	driver.findElement("email");
	driver.sendKeys("email", "user@gmail.com");
	driver.findElement("login_button");
	driver.clickString("login_button");
	driver.quit();
	
//    MeeshoTest mt = new MeeshoTest(null, "chrome");

	}

	
}
