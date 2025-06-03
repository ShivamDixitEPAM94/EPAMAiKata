package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeTrackingPage {
    WebDriver driver;

    public TimeTrackingPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "menu_time_viewTimesheets")
    WebElement timesheetsMenu;

    @FindBy(id = "addTimesheetBtn")
    WebElement addTimesheetButton;

    @FindBy(id = "startDate")
    WebElement startDateField;

    @FindBy(id = "endDate")
    WebElement endDateField;

    public void navigateToTimesheetsPage() {
        timesheetsMenu.click();
    }

    public void addTimesheet(String startDate, String endDate) {
        startDateField.sendKeys(startDate);
        endDateField.sendKeys(endDate);
        addTimesheetButton.click();
    }

    public void verifyTimesheetAdded() {
        // Add verification logic
    }
}