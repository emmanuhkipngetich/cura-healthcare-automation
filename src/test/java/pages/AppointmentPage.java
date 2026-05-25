package pages;

import base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

public class AppointmentPage extends BasePage {

    public AppointmentPage(WebDriver driver) {

        super(driver);
    }

    // Facility Dropdown

    @FindBy(id = "combo_facility")
    WebElement facilityDropdown;

    // Medicare Radio Button

    @FindBy(id = "radio_program_medicare")
    WebElement medicareRadioButton;

    // Visit Date Field

    @FindBy(id = "txt_visit_date")
    WebElement visitDateField;

    // Comment Field

    @FindBy(id = "txt_comment")
    WebElement commentField;

    // Book Appointment Button

    @FindBy(id = "btn-book-appointment")
    WebElement bookAppointmentButton;

    // Select Facility

    public void selectFacility(String facility) {

        Select select =
                new Select(facilityDropdown);

        select.selectByVisibleText(facility);
    }

    // Select Medicare

    public void selectMedicare() {

        medicareRadioButton.click();
    }

    // Enter Visit Date

    public void setVisitDate(String date) {

        visitDateField.sendKeys(date);
    }

    // Enter Comment

    public void enterComment(String comment) {

        commentField.sendKeys(comment);
    }

    // Click Book Appointment

    public void bookAppointment() {

        bookAppointmentButton.click();
    }
}