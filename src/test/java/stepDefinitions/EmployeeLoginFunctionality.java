package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLoginPage;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;

import static org.junit.Assert.assertEquals;

public class EmployeeLoginFunctionality extends Base {
    @Then("I click on Employee Login Menu")
    public void i_click_on_employee_login_menu() {
        click(EmployeeLoginPage.menuEmployeeLogin);
    }
    @Then("I Enter Employee User Id")
    public void i_enter_employee_user_id() {
        sendKeys( EmployeeLoginPage.textEmployeeUserId , "testpilot@gmail.com");
    }
    @Then("I enter Employee Password")
    public void i_enter_employee_password() {
        sendKeys( EmployeeLoginPage.textEmployeePassword ,"1234");
    }
    @When("I click on Employee Login button")
    public void i_click_on_employee_login_button() {
        click( EmployeeLoginPage.btnEmployeeLogin );
    }
    @Then("Verify I am in Employee Home Page")
    public void verify_i_am_in_employee_home_page() {
        String empIdMsg = getText(EmployeeHomePage.employeeIdMsg);
        assertEquals("Employee Id: 102",empIdMsg);
    }
}
