package con_pageobjects01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adact_LoginPage extends Adact_Basecalss{
	public static WebDriver driver;
	//constructor	//identiy element	//Actions
	public Adact_LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="username")
	WebElement usernametxt;
	
	@FindBy(id="password")
	WebElement passtxt;
	
	@FindBy(id="login")
	WebElement btnSignin;
	
	
	public void setusername(String username) {
		usernametxt.sendKeys(username);
	}
	
	public void setpassword(String password) {
		passtxt.sendKeys(password);
	}
	
	public void clickloginbtn() {
		btnSignin.click();
	}
	
}
