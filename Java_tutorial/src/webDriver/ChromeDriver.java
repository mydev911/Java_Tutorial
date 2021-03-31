package webDriver;

public class ChromeDriver implements Webdriver{
	
	
	 public ChromeDriver() {
		System.out.println("Lunch the chromebrowser");
	}
	
	
	
	@Override
    public void get(String url) {
		System.out.println("lunch url " + url);
	
}
	@Override
	public void findElement(String locator) {
		System.out.println("find the element " + locator);
		
	}
	@Override
	public void close() {
		
		System.out.println("close the browser");
		
	}
	@Override
	public void quit() {
		System.out.println(" quit the browser");
	}
	 
	
	

}
