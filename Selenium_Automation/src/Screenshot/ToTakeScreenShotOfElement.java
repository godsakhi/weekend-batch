package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://demo.actitime.");
				
				WebElement element = driver.findElement(By.xpath("//div[text()='Login ']"));
				File source = element.getScreenshotAs(OutputType.FILE);
				File destination = new File("./errorShots/elementShots.png");
				Files.copy(source, destination);
	}
}
