package webDriver;

public interface Webdriver {
	
	public void get(String url);
	
	public void findElement(String locator);
	
	public void close();
	
	public void quit();
	

}
