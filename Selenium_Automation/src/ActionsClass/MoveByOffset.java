package ActionsClass;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
							System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
							WebDriver driver=new ChromeDriver();
							driver.manage().window().maximize();
							driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							driver.get("https://www.myntra.com/");

							
							
							Actions action = new Actions(driver);
							action.moveByOffset(1310, 40).click().perform();
		

		}

	}
