package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public WebDriver getDriver(String browser){
        WebDriver driver = null;
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\IdeaProjects\\Frame\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            default:
                break;
        }

        driver.manage().window().maximize();
        System.out.println("BrowserFactory " + driver);
        return driver;
    }

}
