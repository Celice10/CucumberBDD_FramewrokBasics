package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

        protected WebDriver driver;
        protected WebDriverWait wait;

        public BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        //Click method
    public void click(WebElement element){
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
    }

    //Type method
    public void type(WebElement element, String text){
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(text);
    }

    //Visibility check method
    public boolean isElementVisible(WebElement element){
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    //Get text method
    public String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
}
