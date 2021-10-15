package test.java.testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.pegas.MainPage;

public class SearchTourTest1 extends BaseTest {

    @Test(priority = 1, retryAnalyzer = BaseTest.RunTestAgain.class)
    public void openNewsRegionTest(){

        MainPage mp = new MainPage(this.driver);
        mp.searchTour1();

//        LendingIntroPage lip = ap.login("TestUser23","TestUser23");
//        Assert.assertNotNull(lip.getProfileUserButton());











    }
}
