package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseChildBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com"); // fully qualified URL
    Navigation nav = driver.navigate();
    
    nav.to("https://www.facebook.com/")
	}

}
