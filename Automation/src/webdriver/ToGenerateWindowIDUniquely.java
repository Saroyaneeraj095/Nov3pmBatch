package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateWindowIDUniquely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https;//www.google.co.in/");
	    
	    String winIDForGoogle = driver.getWindowHandle();
	    System.out.println("ID For Google : "+winIDForGoogle);
	    
	     ChromeDriver driver1 = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver1.get("https;//www.facebook.com/");
	     
	     
	}

}
