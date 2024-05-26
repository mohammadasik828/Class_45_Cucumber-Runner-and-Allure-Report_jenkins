package pages;

import org.openqa.selenium.By;

public class CustomerHomePage {
    //Locators
    public static By labelWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome')]");
    public static By labelCustomerMsg = By.xpath("//h2[contains(text(),'Customer')]");
}