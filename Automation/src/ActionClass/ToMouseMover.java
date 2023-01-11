
 package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseMover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/home-furnishing-menu?plaEnabled=false&rf=Discount%20Range%3A40.0_100.0_40.0%20TO%20100.0");
		
		WebElement beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(beauty).perform();
		System.out.println("hey");
	}

}
