package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.get("https://demo.actitime.com/login.do");
					
					WebElement element = driver.findElement(By.xpath("//div[text()='Login']"));
					
					Actions action=new Actions(driver);
					action.click(element).perform();
	}
	
}
