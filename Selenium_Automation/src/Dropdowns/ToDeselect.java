package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {

	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/select-menu");
			
			WebElement element = driver.findElement(By.id("cars"));
			
			Select select = new Select(element);
			select.selectByVisibleText("Audi");
			Thread.sleep(2000);
			select.selectByVisibleText("Opel");
			Thread.sleep(2000);
			select.selectByVisibleText("Volvo");
			Thread.sleep(2000);
			
			select.deselectByIndex(3);
			Thread.sleep(2000);
			select.deselectByVisibleText("Volvo");
			Thread.sleep(2000);
			select.deselectByValue("opel");
			
			Thread.sleep(2000);
			select.selectByVisibleText("Audi");
			Thread.sleep(2000);
			select.selectByVisibleText("Opel");
			Thread.sleep(2000);
			select.selectByVisibleText("Volvo");
			Thread.sleep(2000);
			
			
			
			Thread.sleep(2000);
			select.selectByVisibleText("Audi");
			Thread.sleep(2000);
			select.selectByVisibleText("Opel");
			Thread.sleep(2000);
			select.selectByVisibleText("Volvo");
			Thread.sleep(2000);
			select.deselectAll();
			WebElement firstselect = select.getFirstSelectedOption();
			System.out.println("The First selected option is: "+firstselect.getText());
			
			

	}

}
