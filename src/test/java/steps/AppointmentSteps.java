package steps;

import hooks.Hooks;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;

import pages.ConfirmationPage;

import org.testng.Assert;

import pages.AppointmentPage;

public class AppointmentSteps {

    AppointmentPage appointmentPage;

    @When("User selects Tokyo CURA Healthcare Center")
    public void selectFacility() {

        appointmentPage =
                new AppointmentPage(
                        Hooks.driver
                );

        appointmentPage.selectFacility(
                "Tokyo CURA Healthcare Center"
        );
    }

    @When("User selects Medicare program")
    public void selectMedicare() {

        appointmentPage.selectMedicare();
    }

    @When("User enters visit date")
    public void enterVisitDate() {

        appointmentPage.setVisitDate(
                "30/05/2026"
        );
    }

    @When("User enters appointment comment")
    public void enterComment() {

        appointmentPage.enterComment(
                "Automation Test Appointment"
        );
    }

    @When("User books the appointment")
    public void bookAppointment() {

        appointmentPage.bookAppointment();
    }

    @Then("Appointment should be confirmed")
    public void verifyAppointment() {

        ConfirmationPage confirmationPage =
                new ConfirmationPage(
                        Hooks.driver
                );

        Assert.assertEquals(
                confirmationPage.getFacility(),
                "Tokyo CURA Healthcare Center"
        );

        Assert.assertEquals(
                confirmationPage.getHealthcareProgram(),
                "Medicare"
        );

        Assert.assertEquals(
                confirmationPage.getVisitDate(),
                "30/05/2026"
        );

        Assert.assertEquals(
                confirmationPage.getComment(),
                "Automation Test Appointment"
        );

        System.out.println(
                "Appointment booking validated successfully"
        );
    }
}