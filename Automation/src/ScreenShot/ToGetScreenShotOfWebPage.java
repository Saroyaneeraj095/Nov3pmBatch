package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToGetScreenShotOfWebPage {

	public static void main(String[] args) throws IOException 
	{
		
		Date date = new Date();    //Java.util se import karna hai 
		String sysdateTime = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(sysdateTime);
		
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;       //downcast kiya hai driver me 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/myntra"+sysdateTime+".png");
		Files.copy(source, destination);
		
		
		
	}
}
