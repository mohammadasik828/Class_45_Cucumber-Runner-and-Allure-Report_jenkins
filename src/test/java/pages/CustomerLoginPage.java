package pages;

import base.Base;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Base {
    //Locators
    public static By textCustomerUserId = By.name("mailuid");
    public static By textCustomerPassword = By.xpath("//input[@name='pwd']");
    public static By btnCustomerLogin = By.cssSelector("input[name='login-submit']");


    //Actions
    public static void loginAsCustomer() {
        //-------------------- landing page
        //Click Login Menu
        click( LandingPage.menuLogin );

        //Click Customer Login Menu
        click( EmployeeLoginPage.menuCustomerLogin );     //Ctrl + Shif + F

        //-------------------- customer Login page
        //Enter Customer User Id
        sendKeys( CustomerLoginPage.textCustomerUserId , "david@gmail.com");

        //Enter Customer Password
        sendKeys( CustomerLoginPage.textCustomerPassword ,"1234");

        //Click Customer Login Button
        click( CustomerLoginPage.btnCustomerLogin  );
    }

}
