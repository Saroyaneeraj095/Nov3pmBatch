package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class ToSwitchToParentwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		String parentWindowId = driver.getWindowHandle();
        
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> allWindowIDs = driver.getWindowHandles();
        Thread.sleep(8000);
        for(String id:allWindowIDs)
        {
        	driver.switchTo().window(id);
        	if(!id.equals(parentWindowId)) {
        		driver.findElement(By.linkText("Try Free")).click();
        		break;
        	}
        }
        driver.switchTo().window(parentWindowId);
       
        driver.findElement(By.linkText("actiTIME Inc.")).click();
	}


	}


