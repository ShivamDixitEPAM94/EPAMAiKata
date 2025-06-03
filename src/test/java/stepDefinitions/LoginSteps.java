package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Given("User is on the Login Page")
    public void user_is_on_the_login_page() {
        driver.get("https://example.com/login");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUsername("validUser");
        loginPage.enterPassword("validPassword");
    }

    @When("User enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPassword");
    }

    @And("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the Dashboard")
    public void user_should_be_redirected_to_the_dashboard() {
        // Add assertion for Dashboard URL or element
    }

    @Then("User should see an error message")
    public void user_should_see_an_error_message() {
        // Add assertion for error message
    }
}