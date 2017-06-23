package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(how = How.XPATH, using = "//li/a[@title='Ingresar']")
	public static WebElement link_ingresar;

	@FindBy(how = How.ID, using = "usuario")
	public static WebElement login;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "btn-login-modal")
	public static WebElement btn_ingresar;
	
	@FindBy(how = How.ID, using = "headerUserName")
	public static WebElement headerUserName;

}
