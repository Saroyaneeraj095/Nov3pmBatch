package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile 
{
    // converting the physical representation of property file to java representation
	
	public static void main(String[] args) throws IOException 
	{
	
	FileInputStream fis = new FileInputStream("./TestData/propertyData2.properties");
	
	Properties property = new Properties();
	//we are loading the java represantation of property file 
	
	property.load(fis);
	
	//we are fecthing the value using yhe key
	
	String url = property.getProperty("url");
	System.out.println("the url is :"+url);
	
	String username = property.getProperty("username");
	System.out.println("the username is :"+username);
	
	String password = property.getProperty("password");
	System.out.println("the password is :"+password);
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("url");
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("pwd")).sendKeys(password);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();

}}
