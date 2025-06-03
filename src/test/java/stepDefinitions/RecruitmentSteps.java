package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.RecruitmentPage;
import io.cucumber.java.en.*;

public class RecruitmentSteps {
    WebDriver driver;
    RecruitmentPage recruitmentPage;

    public RecruitmentSteps() {
        driver = Hooks.driver;
        recruitmentPage = PageFactory.initElements(driver, RecruitmentPage.class);
    }

    @When("I navigate to the Job Vacancies page")
    public void navigateToJobVacanciesPage() {
        recruitmentPage.navigateToJobVacanciesPage();
    }

    @When("I add a new job vacancy")
    public void addNewJobVacancy() {
        recruitmentPage.addJobVacancy("Software Engineer", "Engineering");
    }

    @Then("the job vacancy should be added successfully")
    public void verifyJobVacancyAdded() {
        recruitmentPage.verifyJobVacancyAdded();
    }
}