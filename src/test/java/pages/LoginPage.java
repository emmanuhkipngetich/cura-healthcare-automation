package pages;

import base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    @FindBy(id = "txt-username")
    WebElement username;

    @FindBy(id = "txt-password")
    WebElement password;

    @FindBy(id = "btn-login")
    WebElement loginButton;

    public void enterUsername(String user) {

        wait.until(
                ExpectedConditions.visibilityOf(username)
        );

        username.clear();

        username.sendKeys(user);
    }

    public void enterPassword(String pass) {

        wait.until(
                ExpectedConditions.visibilityOf(password)
        );

        password.clear();

        password.sendKeys(pass);
    }

    public void clickLoginButton() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        loginButton
                )
        );

        loginButton.click();
    }
}