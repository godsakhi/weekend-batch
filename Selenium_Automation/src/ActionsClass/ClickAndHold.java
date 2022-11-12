package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
					
						System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.get("https://www.kirupa.com/html5/press_and_hold.htm");

						
						WebElement element = driver.findElement(By.id("item"));
						
						Actions action = new Actions(driver);
						action.clickAndHold(element).perform();
						Thread.sleep(3000);
						action.release().perform();
						
	

	}

}
