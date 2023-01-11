package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		String ProductName = "APPLE iPhone 11 (Red, 128 GB)";
		 String ProductPrice = "₹43,999";
	System. setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/search?q=apple+iphone+11&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
	WebElement price = driver.findElement(By.xpath("//div[text()='"+ProductName+"']/ancestor::div[@class= '_13oc-S\']/descendant::div[text()='"+ProductPrice+"']"));
    String actualPrice = price.getText();	
    System.out.println(actualPrice);
	}

}
