package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm");
			driver.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendkeys("admin");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).clear();
			
			
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendkeys("Test0123");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendkeys(Keys.ENTER);
		}

	}

}
