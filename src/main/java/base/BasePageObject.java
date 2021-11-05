package base;

import com.aventstack.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.Log;
//import org.testng.*;
//import org.testng.Reporter;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public class BasePageObject {
    public WebDriver driver;


    public BasePageObject(WebDriver driver) {

        this.driver = driver;

        System.out.println("BasePageObject " + this.driver);


    }

    public void scrollDawnTillClick(By locator) {

        ((JavascriptExecutor) this.driver).executeScript("window.scrollTo(0, 0);");
        System.out.println("Scroll Top Done");

        for (int i = 0; i <= 30; i++) {
            try {
                new WebDriverWait(driver, 1).until(ExpectedConditions.elementToBeClickable(locator)).click();
                System.out.println("Scroll into view Done " + i);
                break;
            } catch (ElementClickInterceptedException e) {
                System.out.println(e.getMessage() + " " + i);
                new Actions(driver).keyDown(Keys.DOWN).perform();

            }
        }

    }
}