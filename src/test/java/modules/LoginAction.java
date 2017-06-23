package modules;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.LoginPage;

public class LoginAction {

	public static void loginExecute(WebDriver driver, List<HashMap<String, String>> map) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOf(LoginPage.link_ingresar));
		LoginPage.link_ingresar.click();

		wait.until(ExpectedConditions.visibilityOf(LoginPage.login));

		LoginPage.login.sendKeys(map.get(0).get("Mail"));

		wait.until(ExpectedConditions.visibilityOf(LoginPage.password));
		LoginPage.password.sendKeys(map.get(0).get("Password"));

		wait.until(ExpectedConditions.visibilityOf(LoginPage.btn_ingresar));
		LoginPage.btn_ingresar.click();

	}

	public static void loadLoginPage(WebDriver driver, List<HashMap<String, String>> map) {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(LoginPage.headerUserName));
		
		assertTrue(LoginPage.headerUserName.isDisplayed());
		assertEquals(map.get(0).get("Username"), LoginPage.headerUserName.getText());

	}

}
