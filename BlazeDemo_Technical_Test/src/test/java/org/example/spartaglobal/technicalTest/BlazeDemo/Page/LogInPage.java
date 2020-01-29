package org.example.spartaglobal.technicalTest.BlazeDemo.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    private WebDriver driver;

    private By homeButtonID = By.xpath("/html/body/div[1]/div/div/a[3]");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage goToLogInPageURL(){
        driver.findElement(homeButtonID).click();
        return this;
    }

}
