package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.actions.LoginPageActions;

public class LoginPageLocators {

    WebDriver driver;

    public LoginPageLocators(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);  // Initialize the WebElements in this class using PageFactory
    }

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    public WebElement loginButton;

    @FindBy(id = "login-email")
    public WebElement usernameField;

    @FindBy(id = "login-password")
    public WebElement passwordField;

    @FindBy(id = "login-submit")
    public WebElement loginSubmitButton;

}
