package webDriver_Arch;

public class CashifyTest {

	
	
	public static void main(String[] args) {

//Cross browser: FF, Chrome, Safari	
		
//	ChromeDriver driver = new ChromeDriver();	
//	SafariDriver driver = new SafariDriver();	
	
		WebDriver driver = null;
		String browser="opera";
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
	

	}
	
}
