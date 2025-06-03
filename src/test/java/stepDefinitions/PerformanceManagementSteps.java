package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PerformanceManagementPage;
import io.cucumber.java.en.*;

public class PerformanceManagementSteps {
    WebDriver driver;
    PerformanceManagementPage performancePage;

    public PerformanceManagementSteps() {
        driver = Hooks.driver;
        performancePage = PageFactory.initElements(driver, PerformanceManagementPage.class);
    }

    @When("I navigate to the Performance Reviews page")
    public void navigateToPerformanceReviewsPage() {
        performancePage.navigateToPerformanceReviewsPage();
    }

    @When("I add a new performance review")
    public void addNewPerformanceReview() {
        performancePage.addPerformanceReview("John Doe", "2023-10-01", "2023-10-31");
    }

    @Then("the performance review should be added successfully")
    public void verifyPerformanceReviewAdded() {
        performancePage.verifyPerformanceReviewAdded();
    }
}