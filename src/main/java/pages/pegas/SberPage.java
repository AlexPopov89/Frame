package pages.pegas;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SberPage extends BasePageObject {

    //Locators

    By payButton = By.xpath("//span[@langlbl='pay1']");

    public SberPage(WebDriver driver) {

        super(driver);
//        this.driver.get("https://pegastk.com/");
    }

    // Getters:
    public WebElement getPayButton() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.payButton));
    }






    // Action
    public void clickPayButton() {

        this.getPayButton().click();
        System.out.println("Click on an Pay Button");
    }





//    public void inputLogin(String login) {
//
//        this.getLogin().sendKeys(login);
//        System.out.println("Input on an Login");
//    }

//    public void clearLogin() {
//
//        this.getLogin().clear();
//        System.out.println("Clear on an Login");
//    }
//
//    public void inputPassword(String password) {
//
//        this.getPassword().sendKeys(password);
//        System.out.println("Input on an Login");
//    }
//
//    public void clickButtonAuthorization() {
//
//        this.getButtonAuthorization().click();
//        System.out.println("Click on an ButtonAuthorization");
//    }

//    public LendingIntroPage login(String login, String password) {
//
//        this.clickNewsRegion();
//        this.inputLogin(login);
//        this.inputPassword(password);
//        this.clickButtonAuthorization();
//        return new LendingIntroPage(this.driver);
//    }
    public void payTour(){

        this.clickPayButton();
    }



}