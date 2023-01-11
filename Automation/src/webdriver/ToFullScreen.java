package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\selenium program\\Automation\\drivers\\chromedriver.exe");
        
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        
	}

}
