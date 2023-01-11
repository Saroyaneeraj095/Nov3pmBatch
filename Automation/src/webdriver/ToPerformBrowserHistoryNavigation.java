package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.formats.html.Navigation;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver.get("https://www.google.com/");
		
		Navigation nav= driver.navigate();
		
	}

}
