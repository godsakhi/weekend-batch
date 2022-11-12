package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitForTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://demo.actitime.com/login.do");
				
				String titleBeforeLogin = driver.getTitle();
				System.out.println("Title before Login is : "+titleBeforeLogin);
				
				driver.findElement(By.id("username")).sendKeys("admin");
				WebElement passwordtxtfld = driver.findElement(By.name("pwd"));
				passwordtxtfld.sendKeys("manager");
				passwordtxtfld.sendKeys(Keys.ENTER);
				
				WebDriverWait wait = new WebDriverWait(driver , 20);
				wait.until(ExpectedConditions.titleContains("Enter"));
				String titleAfterLogin = driver.getTitle();
				System.out.println("Title after Login is : "+titleBeforeLogin);
	}
	
}
