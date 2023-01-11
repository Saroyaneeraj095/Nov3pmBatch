package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		usernameTextField.sendKeys("trainee");
		usernameTextField.sendKeys(Keys.CONTROL,"a");
		usernameTextField.sendKeys(Keys.CONTROL,"c");
		
		passwordTextField.sendKeys(Keys.CONTROL,"v");
		passwordTextField.sendKeys(Keys.ENTER);
			
		
	}

}
