package webDriver_Arch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		
		System.out.println("launch Firefox browser...");
		}
		
		@Override
		public void findElement(String element) {
			WebDriver.super.findElement(element);
	System.out.println("find element: "+element);
		}

		@Override
		public void findElements(String elements) {
		
			WebDriver.super.findElements(elements);
		System.out.println("find elements");
		}

		@Override
		public void get(String url) {
		
		System.out.println("enter url: "+url);
		}

		@Override
		public String getTitle() {
			
			return "Cashify";
		}

		@Override
		public String getUrl() {
			return "http://www.flipkart.com";
		}

		@Override
		public void clickString(String ele) {
		
		System.out.println("click on element: "+ele);
			
		}

		@Override
		public void sendKeys(String ele, String value) {
		
		System.out.println("enter value in element: "+ele+" "+"value is: "+value);
			
		}

		@Override
		public void quit() {
		
		System.out.println("quit the browser");
			
		}

	
	
}
