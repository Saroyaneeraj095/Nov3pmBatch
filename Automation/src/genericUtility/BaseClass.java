package genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	                 
	@BeforeSuite
	public void bsConf()
	{
		System.out.println("Data Base connection has been established");
	}
	
	@BeforeClass
	public void bcConf()
	{
		System.out.println("Browser has been launched");
		System.out.println("Navigate to the URL");
	}
	
	@BeforeMethod
	public void bmConf()
	{
		System.out.println("Logged in to the application");
		
	}
	
	@AfterMethod
	public void amConf()
	{
		System.out.println("Logged out from the application");
	}
	
	@AfterClass
	public void acConf()
	{
		System.out.println("Browser has been closed");
	}
	
	
	@AfterSuite
	public void asConf()
	{
		System.out.println("Data Base connection has been Closed");
	}
	
	
	
	    
	
	
	
	
	
	
	
	
	
	
	
	
	

}
