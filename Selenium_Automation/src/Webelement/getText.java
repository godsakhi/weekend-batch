package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("dsaf");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		String actualText = driver.findElement(By.xpath("//span[text()='Username or Password is invalid, Please try again.']").getText();
		String expectedText = "Username or Password is invalid";
		if(actualText.contains(expectedText)) {
			System.out.println("Pass: The error message is verified");
		}
		else System.out.println("Fail: The error message is not verified");
		driver.quit();
		}

}
