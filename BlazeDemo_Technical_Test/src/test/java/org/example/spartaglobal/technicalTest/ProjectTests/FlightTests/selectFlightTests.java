package org.example.spartaglobal.technicalTest.ProjectTests.FlightTests;

import org.example.spartaglobal.technicalTest.BlazeDemo.BlazeDemoSite;
import org.example.spartaglobal.technicalTest.BlazeDemo.Page.ChooseDestinationPage;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class selectFlightTests {

    private static SeleniumConfig seleniumConfig;
    private static BlazeDemoSite blazeDemoSite;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","D:\\anis\\spartaglobal\\Engineering43\\chromedriver_win32\\chromedriver.exe");
        blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());
    }


    @Test
    public void selectFlightFromList(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDepartureCity().chooseDestinationCity().goToFindFlightPage().selectPlane();
    }
}
