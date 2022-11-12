package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement UsernameTextField = driver.findElement(By.id("username"));
		WebElement PasswordTextField = driver.findElement(By.id("pwd"));
		UsernameTextField.sendKeys("trainee");
		UsernameTextField.sendKeys(Keys.CONTROL,"a");
		UsernameTextField.sendKeys(Keys.CONTROL,"c");
		PasswordTextField.sendKeys(Keys.CONTROL,"v");
		PasswordTextField.sendKeys(Keys.ENTER);
		
	}
		

}
