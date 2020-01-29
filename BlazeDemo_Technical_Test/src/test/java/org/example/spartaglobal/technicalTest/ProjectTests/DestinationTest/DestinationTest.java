package org.example.spartaglobal.technicalTest.ProjectTests.DestinationTest;

import org.example.spartaglobal.technicalTest.BlazeDemo.BlazeDemoSite;
import org.example.spartaglobal.technicalTest.BlazeDemo.Page.ChooseDestinationPage;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class DestinationTest {

    private static SeleniumConfig seleniumConfig;
    private static ChooseDestinationPage destination_page;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","/Users/tech-a040/Downloads/chromedriver");
        destination_page = new ChooseDestinationPage(seleniumConfig.getDriver());
    }


    @Test
    public void checkDestinationPageIsOpened(){
        destination_page.goToDestinationPageURL();
    }

    @Test
    public void selectDepartureAndDestinationCity(){

        destination_page.goToDestinationPageURL();
        destination_page.chooseDepartureCity();
        destination_page.chooseDestinationCity();
        destination_page.goToFindFlightPage();
    }



}
