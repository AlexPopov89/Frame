package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;


    @Parameters({"browser"})
    @BeforeTest
    public void methodSetUp(String browser){
        System.out.println("Method set up");
        this.driver = new BrowserFactory().getDriver(browser);
        System.out.println("BaseTest " + this.driver);


    }

    @AfterTest
    public void methodTearDown(){
        System.out.println("Method tear down");
        driver.quit();

    }

    public static class RunTestAgain implements IRetryAnalyzer {
        private int nowCount=0;

        @Override
        public boolean retry(ITestResult iTestResult) {
            int maxCount = 1;
            if (nowCount< maxCount) {
                nowCount++;
                return true;
            }
            System.out.println("ТЕСТ ПРОВАЛЕН ДВАЖДЫ!!! ");
            nowCount=0;
            return false;
        }
    }
}