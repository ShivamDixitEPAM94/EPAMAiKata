package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin123");
    }

    @When("I enter invalid username and password")
    public void i_enter_invalid_username_and_password() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPass");
    }

    @And("I click the {string} button")
    public void i_click_the_button(String button) {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        loginPage.verifyDashboard();
        driver.quit();
    }

    @Then("I should see an error message indicating invalid login credentials")
    public void i_should_see_an_error_message_indicating_invalid_login_credentials() {
        loginPage.verifyErrorMessage();
        driver.quit();
    }
}