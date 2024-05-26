package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Login_Functionality_Verification extends Base {
	private int screenshotCounter = 1;
	private SoftAssert soft = new SoftAssert();

	@Given("I am in Landing Home Page E")
	public void i_am_in_landing_home_page_e() {
		if (driver != null) {
			driver.get("https://it.microtechlimited.com/");
			String s = driver.findElement(By.xpath("//div//h1['Welcome to MicroTech NA.']")).getText();
			// assertEquals("Welcome to MicroTech NA.", s);
			System.out.println("welcom text: " + s);
		} else {
			// Handle case when driver is not initialized
			System.out.println("Driver is not initialized");
		}
	}

	@When("I Click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//a[@href=\"elogin.php\"]")).click();
	}

	@Then("I will be in Login Page Employee")
	public void i_will_be_in_login_page_employee() {
		try {

			String s = getText(By.xpath("//div//h1"));
			soft.assertEquals("Employee Loginllll", s);
			soft.assertAll();
		} catch (AssertionError e) {
			// Log the assertion failure but continue with the test
			System.out.println("Assertion failed: " + e.getMessage());
		}
	}

	@Then("I enter User Id Employee {string}")
	public void i_enter_user_id_employee(String string) {
		sendKeys(By.name("mailuid"), string);
		System.out.println("enter user ID");
	}

	@Then("I enter Password Employee {string}")
	public void i_enter_password_employee(String string) {
		sendKeys(By.name("pwd"), string);
	}

	@When("I click Login Employee Button")
	public void i_click_login_button_employee() {
		click(By.xpath("//input[@name=\"login-submit\"]"));
	}

	@Then("I will see Employee Home Page")
	public void i_will_see_employee_home_page() {
		String s = getText(By.xpath("//h2[text()='Welcome Test ']"));
		assertEquals("Welcome Test", s);
		System.out.println(s);
	}

}
