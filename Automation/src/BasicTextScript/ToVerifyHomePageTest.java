package BasicTextScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.LoginPage;

public class ToVerifyHomePageTest 
{

	public static void main(String[] args) throws IOException 
	
	{
		FileUtility fUtils = new FileUtility();
		String url = fUtils.fetchdataFromPropertyFile("url");
		String username = fUtils.fetchdataFromPropertyFile("username");
		String password = fUtils.fetchdataFromPropertyFile("password");
		
		ExcelUtality eUtils = new ExcelUtality();
	    String expectedTitle = fUtils.fetchdataFromExcelSheets("Sheet2",1,0);
		
		//Test Script
	    
		
		
		
		
		
		
		
		
		
		
		FileInputStream fis = new FileInputStream("./testdata/propertyData2.properties");
	    Properties property = new Properties();
	    property.load(fis);
	    
	}
}
