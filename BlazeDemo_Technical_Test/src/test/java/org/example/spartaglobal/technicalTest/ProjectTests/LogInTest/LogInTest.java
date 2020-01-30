package org.example.spartaglobal.technicalTest.ProjectTests.LogInTest;

import org.example.spartaglobal.technicalTest.BlazeDemo.BlazeDemoSite;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogInTest {

    private static SeleniumConfig seleniumConfig;
    private static BlazeDemoSite blazeDemoSite;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","D:\\anis\\spartaglobal\\Engineering43\\chromedriver_win32\\chromedriver.exe");
        blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());
    }

    @Test
    public void goToHomePageFromDestinationPage(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().goToLogInPageURL();
    }

    @Test
    public void goToRegisterPage(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().goToLogInPageURL();
        blazeDemoSite.logInPage().goToRegisterPage();
    }

    @Test
    public void fillOutRegisterPage(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().goToLogInPageURL();
        blazeDemoSite.logInPage().goToRegisterPage()
                .fillRegisterName("Anis Subba")
                .fillRegisterCompanyName("Sparta Global")
                .fillRegisterEmail("ASubba@spartaglobal.com")
                .fillInLogInPassword("aklist12345")
                .fillRegisterReEnterPassword("aklist12345")
                .clickRegisterButton();
    }

    @Test
    public void EnterValidLogInEmailAndPassword(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().goToLogInPageURL();
        blazeDemoSite.logInPage()
                .fillInLogInEmail("ASubba@spartaglobal.com")
                .fillInLogInPassword("aklist12345")
                .tickRememberMe()
                .clickLogInButton();
    }

}
