package stepDefinition;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataArgenprop;
import modules.LoginAction;
import pageobjects.LoginPage;

public class LoginSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public LoginSteps() {
		driver = Hooks.driver;
		datamap = DataArgenprop.data();
	}

	@Given("^Ingreso al sitio web de argenprop$")
	public void ingreso_al_sitio_web_de_argenprop() throws Throwable {

		driver.get("http://www.argenprop.com/");

	}

	@When("^Ingreso mis credentiales$")
	public void ingreso_mis_credentiales() throws Throwable {

		PageFactory.initElements(driver, LoginPage.class);
		LoginAction.loginExecute(driver, datamap);

	}

	@Then("^Carga sastifactoriamente la pantalla login$")
	public void carga_sastifactoriamente_la_pantalla_login() throws Throwable {

		PageFactory.initElements(driver, LoginPage.class);
		LoginAction.loadLoginPage(driver, datamap);

	}

}
