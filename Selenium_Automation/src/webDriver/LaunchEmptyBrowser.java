package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyBrowser {



		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://wwww.facebook.com");
			String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			System.out.println(driver.getPageSource());
			
			driver.navigate().to("https://www.instagram.com/");
			
			driver.navigate().back();
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
}