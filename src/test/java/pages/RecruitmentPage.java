package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage {
    WebDriver driver;

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "menu_recruitment_viewJobVacancy")
    WebElement jobVacanciesMenu;

    @FindBy(id = "addJobVacancyBtn")
    WebElement addJobVacancyButton;

    @FindBy(id = "jobTitle")
    WebElement jobTitleField;

    @FindBy(id = "department")
    WebElement departmentField;

    public void navigateToJobVacanciesPage() {
        jobVacanciesMenu.click();
    }

    public void addJobVacancy(String jobTitle, String department) {
        jobTitleField.sendKeys(jobTitle);
        departmentField.sendKeys(department);
        addJobVacancyButton.click();
    }

    public void verifyJobVacancyAdded() {
        // Add verification logic
    }
}