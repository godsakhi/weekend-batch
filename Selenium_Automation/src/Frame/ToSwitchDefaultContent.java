package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSwitchDefaultContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/draggable/");
			
			driver.switchTo().frame(0);
			
			WebElement webElement = driver.findElement(By.id("draggable"));
			Actions action=new Actions(driver);
			
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[text()=' view source']")).click();
	}

}
