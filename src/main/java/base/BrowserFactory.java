package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

    public WebDriver getDriver(String browser){
        WebDriver driver = null;
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.setHeadless(true);
                driver = new ChromeDriver(options);
                System.out.println("Title of the page : " + driver.getTitle());
//                System.out.println("URL of the page : " + driver.getCurrentUrl());
                break;

            default:
                break;
        }

        driver.manage().window().maximize();
        System.out.println("BrowserFactory " + driver);
        return driver;
    }

}
