package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIDs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https;//demo.actitime.com/login.do");
        
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        
        set<Sring> allWinIDs = driver.get
		
	}

}