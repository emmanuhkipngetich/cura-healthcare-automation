package steps;

import hooks.Hooks;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;


import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Given("User launches CURA website")
    public void launchWebsite() {

        loginPage =
                new LoginPage(Hooks.driver);
    }

    @When("User clicks Make Appointment")
    public void clickAppointment() {

        Hooks.driver.findElement(
                By.id("btn-make-appointment")
        ).click();
    }

    @When("User enters valid username and password")
    public void enterCredentials() {

        loginPage.enterUsername(
                "John Doe"
        );

        loginPage.enterPassword(
                "ThisIsNotAPassword"
        );
    }

    @When("User clicks Login button")
    public void clickLoginButton() {

        Hooks.driver.findElement(By.id("btn-login")).click();
    }
}