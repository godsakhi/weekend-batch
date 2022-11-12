package Sakshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch web page https://www.calculator.net/
		driver.get("https://www.calculator.net/");
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		
		System.out.println("Total links on webpage:" + linkElements.size());
		
		driver.close();
		
		
	}

}
