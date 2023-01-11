package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("file:///C:/Users/Shri/Desktop/webpageCODE.html");
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("html/body/input[1]")).sendKeys("Neeeraj"); 
    
	}

}
