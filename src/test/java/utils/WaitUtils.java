package utils;

import hooks.Hooks;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public static void waitForElement(
            By locator
    ) {

        WebDriverWait wait =
                new WebDriverWait(
                        Hooks.driver,
                        Duration.ofSeconds(15)
                );

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                locator
                        )
        );
    }
}