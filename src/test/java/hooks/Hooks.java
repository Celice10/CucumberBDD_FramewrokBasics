package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() {

        driver = BrowserFactory.startBrowser();
    }

    /*@After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        if(driver != null) {
            driver.quit();
        }
    }*/
}
