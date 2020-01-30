package org.example.spartaglobal.technicalTest.ProjectTests.DestinationTest;

import org.example.spartaglobal.technicalTest.BlazeDemo.BlazeDemoSite;
import org.example.spartaglobal.technicalTest.BlazeDemo.Page.ChooseDestinationPage;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class DestinationTest {

    private static SeleniumConfig seleniumConfig;
    private static ChooseDestinationPage destination_page;
    private static BlazeDemoSite blazeDemoSite;


    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","D:\\anis\\spartaglobal\\Engineering43\\chromedriver_win32\\chromedriver.exe");
        destination_page = new ChooseDestinationPage(seleniumConfig.getDriver());
        blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());
    }


    @Test
    public void checkDestinationPageIsOpened(){
        destination_page.goToDestinationPageURL();
    }

    @Test
    public void selectDepartureAndDestinationCity(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDepartureCity().chooseDestinationCity().goToFindFlightPage();
    }



}
