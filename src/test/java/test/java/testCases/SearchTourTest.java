package test.java.testCases;

//import main.java.base.BaseTest;
//import main.java.pages.AuthorizationPage;
//import main.java.pages.CRM.LendingIntroPage;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.pegas.MainPage;

public class SearchTourTest extends BaseTest {

    @Test(priority = 1, retryAnalyzer = BaseTest.RunTestAgain.class)
    public void openNewsRegionTest(){

        MainPage mp = new MainPage(this.driver);
        mp.searchTour();

//        LendingIntroPage lip = ap.login("TestUser23","TestUser23");
//        Assert.assertNotNull(lip.getProfileUserButton());











    }
}
