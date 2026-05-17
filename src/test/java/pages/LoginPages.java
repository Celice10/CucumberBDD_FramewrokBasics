package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    public WebElement loginButton;

    @FindBy(id = "login-email")
    public WebElement usernameField;

    @FindBy(id = "login-password")
    public WebElement passwordField;

    @FindBy(id = "login-submit")
    public WebElement loginSubmitButton;


    public LoginPages(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);  // Initialize the WebElements in this class using PageFactory
    }


    public void clickLoginButtonOnHomePage() {
        loginButton.click();
    }

    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginSubmitButton.click();
    }
}
