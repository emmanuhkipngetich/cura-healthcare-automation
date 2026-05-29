package pages;

import base.BasePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ConfirmationPage(WebDriver driver) {

        super(driver);

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    // Facility

    @FindBy(id = "facility")
    WebElement facility;

    // Healthcare Program

    @FindBy(id = "program")
    WebElement healthcareProgram;

    // Visit Date

    @FindBy(id = "visit_date")
    WebElement visitDate;

    // Comment

    @FindBy(id = "comment")
    WebElement comment;

    // Get Facility

    public String getFacility() {

        wait.until(
                ExpectedConditions.visibilityOf(
                        facility
                )
        );

        return facility.getText();
    }

    // Get Healthcare Program

    public String getHealthcareProgram() {

        wait.until(
                ExpectedConditions.visibilityOf(
                        healthcareProgram
                )
        );

        return healthcareProgram.getText();
    }

    // Get Visit Date

    public String getVisitDate() {

        wait.until(
                ExpectedConditions.visibilityOf(
                        visitDate
                )
        );

        return visitDate.getText();
    }

    // Get Comment

    public String getComment() {

        wait.until(
                ExpectedConditions.visibilityOf(
                        comment
                )
        );

        return comment.getText();
    }
}