package Dropdowns;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ToVerifySingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
						
						System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.get("https://demoqa.com/select-menu");
						
						WebElement element = driver.findElement(By.id("oldSelectMenu"));
						
						Select select = new Select(element);
						boolean multiSelect = select.isMultiple();
						
						if(multiSelect) {
							
							System.out.println("Pass: The dropdown is MultiSelect:");
						}
						else

							System.out.println("Fail: The dropdown is MultiSelect:");
							
							
						}
						
						

	}
