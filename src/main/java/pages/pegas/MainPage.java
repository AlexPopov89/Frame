package pages.pegas;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.Log;

public class MainPage extends BasePageObject {


    //Locators
    By login = By.id("loginEdit-el");
    By password = By.id("passwordEdit-el");
    By buttonAuthorization = By.id("t-comp14-textEl");
    By searchTour = By.xpath("//div[@class='TVSearchButton']");
    By departureFrom = By.xpath("//div[contains(@class,'TVLocationButton')]");
    By choosingACityDeparture = By.xpath("(//div[contains(@class,'TVItemBold')])[2]");
    By placeOfArrival = By.xpath("//div[contains(@class,'TVCountry')]");
    By choosingACountryArrival1 = By.xpath("(//div[@class='TVCountryCheckboxName'])[1]");
    By byeATour = By.xpath("(//a[@href='https://pegastk.com/pay/'])[1]");
    By choosingACountryArrival2 = By.xpath("(//div[@class='TVCountryCheckboxName'])[2]");
    By choosingACountryArrival3 = By.xpath("(//div[@class='TVCountryCheckboxName'])[3]");


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

    public WebElement getChoosingACountryArrival1() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.choosingACountryArrival1));
    }

    public WebElement getByeATour() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.byeATour));
    }

    public WebElement getChoosingACountryArrival2() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.choosingACountryArrival2));
    }

    public WebElement getChoosingACountryArrival3() {

        return new WebDriverWait(this.driver, 30).until(ExpectedConditions.elementToBeClickable(this.choosingACountryArrival3));
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

    public void clickСhoosingACountryArrival1() {

        this.getChoosingACountryArrival1().click();
        System.out.println("Click on an Сhoosing A City Arrival Country1");
    }

    public void clickByeATour() {

        this.getByeATour().click();
        System.out.println("Click on an Bye a Tour");
    }

    public void clickСhoosingACountryArrival2() {

        this.getChoosingACountryArrival2().click();
        System.out.println("Click on an Сhoosing A City Arrival Country2");
    }

    public void clickСhoosingACountryArrival3() {

        this.getChoosingACountryArrival3().click();
        System.out.println("Click on an Сhoosing A City Arrival Country3");
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
    public void searchTour1(){

        this.clickDepartureFrom();
        this.clickChoosingACity();
        this.clickPlaceOfArrival();
        this.clickСhoosingACountryArrival1();
        this.clickSearchTour();
    }

    public void searchTour2(){

        this.clickDepartureFrom();
        this.clickChoosingACity();
        this.clickPlaceOfArrival();
        this.clickСhoosingACountryArrival2();
        this.clickSearchTour();
    }

    public void searchTour3(){

        this.clickDepartureFrom();
        this.clickChoosingACity();
        this.clickPlaceOfArrival();
        this.clickСhoosingACountryArrival3();
        this.clickSearchTour();
    }

    public ByeATourPage bueTour(){

        this.clickByeATour();
        return new ByeATourPage(this.driver);
    }

}