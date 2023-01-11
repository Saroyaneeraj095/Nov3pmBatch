package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 

{  
	WebDriver driver;
   public HomePage(WebDriver driver)    //constructor
	{
	   PageFactory.initElements(driver,this);
	   this.driver = driver;
		
	}
   
   @FindBy(id = "logoutLink")        //identify element
   private WebElement logoutButton;
   
   public WebElement getLogoutButton()
   {
	return logoutButton;
	   
   }
   
   public String verifyHomePAsgeTitle()
   {
	return driver.getTitle();
   }
    
   public void logoutAction()
   {
	   logoutButton.click();
   }
   
   
   
   
   
   
   
   
}
