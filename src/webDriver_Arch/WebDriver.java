package webDriver_Arch;

public interface WebDriver extends SearchContext {

	@Override
	default void findElement(String element) {
	
		
	}

	@Override
	default void findElements(String elements) {
			
	}
	
	public void get(String url);
	
	public String getTitle();
	public String getUrl();
	public void clickString(String ele);
	public void sendKeys(String ele, String value);
    public void quit();
    
	
	
	

}
