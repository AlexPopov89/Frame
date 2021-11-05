package test.java.testCases;


import base.BaseTest;
import org.testng.annotations.Test;
import pages.pegas.ByeATourPage;
import pages.pegas.MainPage;
import pages.pegas.SberPage;



public class ByeATourTest extends BaseTest {

    @Test(priority = 1, retryAnalyzer = RunTestAgain.class)
    public void openByeATourTest(){


        MainPage mp = new MainPage(this.driver);
        ByeATourPage btp = mp.bueTour();
        SberPage sb = btp.paymentTour();
        sb.payTour();

//        LendingIntroPage lip = ap.login("TestUser23","TestUser23");
//        Assert.assertNotNull(lip.getProfileUserButton());











    }
}
