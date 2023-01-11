package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ToVerifyMultiSelect 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select selectElement = new Select(dropDown);
		
		
		boolean multiple =selectElement.isMultiple(); 
		
		if(multiple)
		{
			System.out.println("pass: The dropdown is multiselect");
		}
		else
			System.out.println("Fail : The dropdown is singleselect");
	}

}
