package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Launch Chrome Web browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		//Launch google web page
		driver.navigate().to("http:\\www.google.com");
		
		//Capture title of webpage and print
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		
		//Capture Url of the webpage
		System.out.println("URL : " + driver.getCurrentUrl());
		System.out.println("page source: " +driver .getPageSource());
		
			
	}

}
