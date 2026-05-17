package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPages;
import utils.BrowserFactory;
import utils.ConfigReader;

import javax.swing.*;


public class LoginSteps {

    WebDriver driver;
    LoginPages loginPage;

    @Given("user is on the Home page")
    public void user_is_on_the_home_page() {
        driver = BrowserFactory.getDriver();
        loginPage = new LoginPages(driver);
        loginPage.clickLoginButtonOnHomePage();

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {

        Thread.sleep(3000);
        loginPage.enterUsername(ConfigReader.getUsername());
        loginPage.enterPassword(ConfigReader.getPassword());
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() {

    }
}
