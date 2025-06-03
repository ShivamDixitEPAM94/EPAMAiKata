package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PerformanceManagementPage {
    WebDriver driver;

    public PerformanceManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "menu_performance_viewPerformanceReviews")
    WebElement performanceReviewsMenu;

    @FindBy(id = "addPerformanceReviewBtn")
    WebElement addPerformanceReviewButton;

    @FindBy(id = "employeeName")
    WebElement employeeNameField;

    @FindBy(id = "reviewStartDate")
    WebElement reviewStartDateField;

    @FindBy(id = "reviewEndDate")
    WebElement reviewEndDateField;

    public void navigateToPerformanceReviewsPage() {
        performanceReviewsMenu.click();
    }

    public void addPerformanceReview(String employeeName, String startDate, String endDate) {
        employeeNameField.sendKeys(employeeName);
        reviewStartDateField.sendKeys(startDate);
        reviewEndDateField.sendKeys(endDate);
        addPerformanceReviewButton.click();
    }

    public void verifyPerformanceReviewAdded() {
        // Add verification logic
    }
}