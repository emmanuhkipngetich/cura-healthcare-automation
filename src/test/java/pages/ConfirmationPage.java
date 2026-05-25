package pages;

import base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage {

    public ConfirmationPage(WebDriver driver) {

        super(driver);
    }

    // Facility

    @FindBy(xpath = "//p[@id='facility']")
    WebElement facility;

    // Healthcare Program

    @FindBy(xpath = "//p[@id='program']")
    WebElement healthcareProgram;

    // Visit Date

    @FindBy(xpath = "//p[@id='visit_date']")
    WebElement visitDate;

    // Comment

    @FindBy(xpath = "//p[@id='comment']")
    WebElement comment;

    // Get Facility

    public String getFacility() {

        return facility.getText();
    }

    // Get Healthcare Program

    public String getHealthcareProgram() {

        return healthcareProgram.getText();
    }

    // Get Visit Date

    public String getVisitDate() {

        return visitDate.getText();
    }

    // Get Comment

    public String getComment() {

        return comment.getText();
    }
}