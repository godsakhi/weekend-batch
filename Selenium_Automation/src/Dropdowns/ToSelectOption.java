package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/select-menu");
			
			WebElement element = driver.findElement(By.id("oldSelectMenu"));
			
			Select select = new Select(element);
			select.selectByVisibleText("Magenta");
			Thread.sleep(2000);
			select.selectByIndex(5);
			Thread.sleep(2000);
			select.selectByValue("8");
			
			
	}

}
