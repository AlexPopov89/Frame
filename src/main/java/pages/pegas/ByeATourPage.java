package pages.pegas;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ByeATourPage extends BasePageObject {

    //Locators

    By paymentButton = By.xpath("(//a[@href='https://securepayments.sberbank.ru/shortlink/KAxSh7vi'])[1]");

    public ByeATourPage(WebDriver driver) {

        super(driver);
//        this.driver.get("https://pegastk.com/");
    }

    // Getters:
    public WebElement getPaymentButton() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.paymentButton));
    }






    // Action
    public void clickPaymentButton() {

        this.getPaymentButton().click();
        System.out.println("Click on an Payment Button");
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
    public SberPage paymentTour(){

        this.clickPaymentButton();
        return new SberPage(this.driver);
    }



}