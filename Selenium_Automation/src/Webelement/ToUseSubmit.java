package Webelement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToUseSubmit {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Avita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("Sign Up")).submit();
			

	}

}
