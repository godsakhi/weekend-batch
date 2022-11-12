package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClickOnDisabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
			
			driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hfit.tar.gz']")).click();
			
			WebElement element = driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hfit.tar.gz']"));
					
					JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
	}
}
