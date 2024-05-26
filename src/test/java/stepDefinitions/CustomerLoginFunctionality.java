package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import org.testng.Assert;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

import static org.junit.Assert.assertEquals;

public class CustomerLoginFunctionality extends Base {
	@Given("I am in Landing Page")
	public void i_am_in_landing_page() {
		navigate("http://it.microtechlimited.com");
	}

	@Then("I click on Login Menu")
	public void i_click_on_login_menu() {
		click(LandingPage.menuLogin);
	}

	@Then("I click on Customer Login Menu")
	public void i_click_on_customer_login_menu() {
		click(EmployeeLoginPage.menuCustomerLogin);
	}

	@Then("I Enter User Id")
	public void i_enter_user_id() {
		sendKeys(CustomerLoginPage.textCustomerUserId, "david@gmail.com");
	}

	@Then("I enter Password")
	public void i_enter_password() {
		sendKeys(CustomerLoginPage.textCustomerPassword, "1234");
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		click(CustomerLoginPage.btnCustomerLogin);
	}

	@Then("Verify I am in Customer Home Page")
	public void verify_i_am_in_customer_home_page() {
		String welcomeMsg = getText(CustomerHomePage.labelWelcomeMsg);
		assertEquals("Welcome David99999", welcomeMsg);
	}

}
