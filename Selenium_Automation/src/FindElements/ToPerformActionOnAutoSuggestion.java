package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionOnAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		String expectedSuggestion = "selenium webdriver";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
		for(WebElement suggestion:autosuggestions) {
			String actualSuggestion = suggestion.getText();
			if(actualSuggestion.equals(expectedSuggestion)) {
				suggestion.click();
				break;
			}
		}
	}
}
