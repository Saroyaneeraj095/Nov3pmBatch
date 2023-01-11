package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWaitForButtonToEnable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://github.com/signup?user_email=&source=form-home-signup");
	
	driver.findElement(By.id("email")).sendKeys("neerajsaroya095@gmail.com");
	
	WebElement button = driver.findElement(By.xpath("(//button[cointains(text(),'Continue')])[1]"));
	button.click();
	

	}

}
