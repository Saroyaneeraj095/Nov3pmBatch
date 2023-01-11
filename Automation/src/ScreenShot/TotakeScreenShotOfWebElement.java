package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TotakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		Date date = new Date();    //Java.util se import karna hai 
		String sysdateTime = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(sysdateTime);
		
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='desktop-logoContainer']"));
		
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/myntralogo"+sysdateTime+".png");
		Files.copy(source,destination);

	}

}
