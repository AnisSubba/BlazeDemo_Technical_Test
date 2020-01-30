package org.example.spartaglobal.technicalTest.BlazeDemo;

import org.example.spartaglobal.technicalTest.BlazeDemo.Page.ChooseDestinationPage;
import org.example.spartaglobal.technicalTest.BlazeDemo.Page.FormPage;
import org.example.spartaglobal.technicalTest.BlazeDemo.Page.LogInPage;
import org.openqa.selenium.WebDriver;

public class BlazeDemoSite {
    private WebDriver driver;
    private ChooseDestinationPage destinationPage;
    private FormPage formPage;
    private LogInPage logInPage;

    public BlazeDemoSite(WebDriver driver){
        this.driver = driver;
        this.destinationPage = new ChooseDestinationPage(driver);
        this.formPage = new FormPage(driver);
        this.logInPage = new LogInPage(driver);
    }

    public ChooseDestinationPage getDestinationPage(){
        return destinationPage;
    }

    public FormPage formPage(){
        return formPage;
    }

    public LogInPage logInPage(){
        return logInPage;
    }
}
