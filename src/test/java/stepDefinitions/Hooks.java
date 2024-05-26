package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hooks extends Base {
    @Before
    public void setup() throws MalformedURLException {
        ChromeOptions opt = new ChromeOptions();
    	 	 driver = new RemoteWebDriver(new URL("http://3.142.141.206:4444"),opt);
    	 }
    private int screenshotCounter = 1; // Initialize a counter for screenshots
	   @AfterStep(order = 1)
	   public void captureScreenshot(Scenario scenario) {
	       try {
	           if (scenario.isFailed()) {
	               TakesScreenshot ts = (TakesScreenshot) driver;
	               byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	               // Create a unique name for each screenshot
	               String screenshotName = "Step_" + scenario.getName() + "_Screenshot_" + screenshotCounter;
	               scenario.attach(screenshot, "image/png", screenshotName);
	               screenshotCounter++;
	           }
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	   }
    @After
    public void tearDown() throws InterruptedException {
    	 if (driver != null) {
             driver.quit(); 
         }
    }
}
