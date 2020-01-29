package org.example.spartaglobal.technicalTest.ProjectTests.LogInTest;

import org.example.spartaglobal.technicalTest.BlazeDemo.Page.ChooseDestinationPage;
import org.example.spartaglobal.technicalTest.BlazeDemo.Page.LogInPage;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogInTest {

    private static SeleniumConfig seleniumConfig;
    private static ChooseDestinationPage destination_page;
    private static LogInPage logInPage;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a040/Downloads/chromedriver");
        destination_page = new ChooseDestinationPage(seleniumConfig.getDriver());
        logInPage = new LogInPage(seleniumConfig.getDriver());
    }


    @Test
    public void checkDestinationPageIsOpened(){
        destination_page.goToDestinationPageURL();
    }

    @Test
    public void goToHomePageFromDestinationPage(){
        destination_page.goToDestinationPageURL();
        logInPage.goToLogInPageURL();
    }

}
