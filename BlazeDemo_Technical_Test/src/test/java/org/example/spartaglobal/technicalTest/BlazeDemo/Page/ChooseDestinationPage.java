package org.example.spartaglobal.technicalTest.BlazeDemo.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ChooseDestinationPage {

    private WebDriver driver;
    private String destinationPageURL = "http://blazedemo.com/index.php";

    private By departureCityID = By.name("fromPort");
    private By destinationCityID = By.name("toPort");
    private By findFlightID = By.xpath("/html/body/div[3]/form/div/input");
    private By planeSelectedID = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input");
    private By homeButtonID = By.xpath("/html/body/div[1]/div/div/a[3]");


    public ChooseDestinationPage(WebDriver driver) {this.driver = driver;}

    public ChooseDestinationPage goToDestinationPageURL() {
        driver.navigate().to(destinationPageURL);
        return this;
    }

    public ChooseDestinationPage chooseDepartureCity(){
       Select option = new Select(driver.findElement(departureCityID));

        for (int i = 0; i < option.getOptions().size(); i++){
            option.selectByIndex(i);
        }
        return this;
    }

    public ChooseDestinationPage chooseDestinationCity(){
        Select option = new Select(driver.findElement(destinationCityID));

        for (int i = 0; i < option.getOptions().size(); i++){
            option.selectByIndex(i);
        }
        return this;
    }

    public ChooseDestinationPage goToFindFlightPage(){
        driver.findElement(findFlightID).submit();
        return this;
    }

    public ChooseDestinationPage selectPlane(){
        driver.findElement(planeSelectedID).click();
        return this;
    }

    public ChooseDestinationPage goToLogInPageURL(){
        driver.findElement(homeButtonID).click();
        return this;
    }
}
