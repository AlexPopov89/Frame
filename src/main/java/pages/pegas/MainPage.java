package pages.pegas;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePageObject {

    //Locators
    By login = By.id("loginEdit-el");
    By password = By.id("passwordEdit-el");
    By buttonAuthorization = By.id("t-comp14-textEl");
    By searchTour = By.xpath("//div[@class='TVSearchButton']");
    By departureFrom = By.xpath("//div[contains(@class,'TVLocationButton')]");
    By choosingACityDeparture = By.xpath("(//div[contains(@class,'TVItemBold')])[2]");
    By placeOfArrival = By.xpath("//div[contains(@class,'TVCountry')]");
    By choosingACountryArrival = By.xpath("//div[text()='Абхазия']");

    public MainPage(WebDriver driver) {

        super(driver);
        this.driver.get("https://pegastk.com/");
    }

    // Getters:
    public WebElement getSearchTour() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.searchTour));
    }

    public WebElement getDepartureFrom() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.departureFrom));
    }

    public WebElement getChoosingACityDeparture() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.choosingACityDeparture));
    }

    public WebElement getPlaceOfArrival() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.placeOfArrival));
    }

    public WebElement getChoosingACountryArrival() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.choosingACountryArrival));
    }


//    public WebElement getLogin() {
//
//        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.login));
//    }
//
//    public WebElement getPassword() {
//
//        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.password));
//    }
//
//    public WebElement getButtonAuthorization() {
//
//        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.buttonAuthorization));
//    }

    // Action
    public void clickSearchTour() {

        this.getSearchTour().click();
        System.out.println("Click on an Search Tour");
    }

    public void clickDepartureFrom() {

        this.getDepartureFrom().click();
        System.out.println("Click on an Departure From");
    }

    public void clickChoosingACity() {

        this.getChoosingACityDeparture().click();
        System.out.println("Click on an Choosing A City");
    }

    public void clickPlaceOfArrival() {

        this.getPlaceOfArrival().click();
        System.out.println("Click on an Place Of Arrival");
    }

    public void clickСhoosingACountryArrival() {

        this.getChoosingACountryArrival().click();
        System.out.println("Click on an Сhoosing A City Arrival Country");
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
    public void searchTour(){

        this.clickDepartureFrom();
        this.clickChoosingACity();
//        this.clickPlaceOfArrival();
//        this.clickСhoosingACountryArrival();
//        this.clickSearchTour();
    }
}