package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetFirstSelectOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("volvo");
		Thread.sleep(2000);
		select.selectByValue("saab");
		Thread.sleep(2000);
		
		List<WebElement> allselected = select.getAllSelectedOptions();
		for(WebElement options:allselected)
		{
			System.out.println(options.getText());
		}
		WebElement firstOption = select.getFirstSelectedOption();
		{
			System.out.println("Firstoption : "+firstOption.getText());
		}
	}

}