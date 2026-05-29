package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);



        options.addArguments(
                "--disable-save-password-bubble"
        );

        options.addArguments(
                "--disable-notifications"
        );

        options.addArguments(
                "--disable-popup-blocking"
        );

        options.addArguments(
                "--incognito"
        );

        driver = new ChromeDriver(options);

       // driver.manage().window().maximize();

        driver.get(
                "https://katalon-demo-cura.herokuapp.com/"
        );
    }

    @After
    public void teardown() {

        System.out.println(
                "Browser left open for debugging"
        );

         driver.quit();
    }
}