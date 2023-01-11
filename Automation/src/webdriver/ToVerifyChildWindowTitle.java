package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyChildWindowTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();  
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    
	    String parentWindowID = driver.getWindowHandle();
	    
	    driver.findElement(By.linkText("actiTIME Inc.")).click();
	    Thread.sleep(3000);
	    Set<String> windowIDs = driver.getWindowHandles();
	    
	    for(String id : windowIDs)
	    {
	    	driver.switchTo().window(id);
	    	if(id != parentWindowID);
	    	{
	    	    String actualTitle = driver.getTitle();
	    	    { 
	    	     System.out.println(actualTitle);
	    	    }
	    	    
	    	}
	    }
	
	}
}
