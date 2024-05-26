package base;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
    public static WebDriver driver;
    
    public static void navigate(String url) { 
	driver.get(url);    }

    public static void click( By locator  ) {
        driver.findElement( locator ).click();
    }

    public static void sendKeys(By locator, String keys) {
        driver.findElement( locator ).sendKeys(keys);
    }

    public static String getText(By locator) {
        String s = driver.findElement(locator).getText();
        return s;
    }
    public void tearDown(Scenario scenario) throws InterruptedException {
        //Thread.sleep(20000);
        //driver.close(); //to close Current Tab of the Browser
        driver.quit();  //to close Browser Application or Window
        
	        try {
	            String screenshotName= scenario.getName().replace("", "");
	            if(scenario.isFailed()) {
	                scenario.log("this is my failure message");
	                TakesScreenshot ts = (TakesScreenshot)driver;
	                byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
	                scenario.attach(screenshot, "image/png", screenshotName);
	            }
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        
	        driver.quit();
	    }
}

