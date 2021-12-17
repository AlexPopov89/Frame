package test.java.testCases;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.pegas.MainPage;


public class SearchTourTest1 extends BaseTest {

    @Test(priority = 1, retryAnalyzer = BaseTest.RunTestAgain.class)
    public void openNewsRegionTest(){

        MainPage mp = new MainPage(this.driver);
        mp.searchTour1();

    }
}
