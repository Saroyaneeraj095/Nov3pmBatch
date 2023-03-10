
package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 
{
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	//identify WebElememnt
	@FindBy(id = "username")
	private WebElement usernameTextField;
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;

	
	//private member access
	public WebElement getUsernameTextField() 
	{
		return usernameTextField;
	}

	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
	
	//Business logic use because repetitive task on same page
	public void loginAction(String username,String password) 
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	

}
