package JavaScriptExecutor;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollBoth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2");
		driver.manage().window().setSize(new Dimension(200,500));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window,scrollBy(200,500)");              //window,scrollTo(200,500)
		
		js.executeScript("history.go(0)");                              //To refresh the code
		
		String title = js.executeScript("return document.title").toString();            //To get title
		System.out.println(title);

	}

}
