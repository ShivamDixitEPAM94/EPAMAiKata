package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.TimeTrackingPage;
import io.cucumber.java.en.*;

public class TimeTrackingSteps {
    WebDriver driver;
    TimeTrackingPage timePage;

    public TimeTrackingSteps() {
        driver = Hooks.driver;
        timePage = PageFactory.initElements(driver, TimeTrackingPage.class);
    }

    @When("I navigate to the Timesheets page")
    public void navigateToTimesheetsPage() {
        timePage.navigateToTimesheetsPage();
    }

    @When("I add a new timesheet")
    public void addNewTimesheet() {
        timePage.addTimesheet("2023-10-01", "2023-10-07");
    }

    @Then("the timesheet should be added successfully")
    public void verifyTimesheetAdded() {
        timePage.verifyTimesheetAdded();
    }
}