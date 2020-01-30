package org.example.spartaglobal.technicalTest.ProjectTests.FormTests;

import org.example.spartaglobal.technicalTest.BlazeDemo.BlazeDemoSite;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class formTests {
    private static SeleniumConfig seleniumConfig;
    private static BlazeDemoSite blazeDemoSite;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","D:\\anis\\spartaglobal\\Engineering43\\chromedriver_win32\\chromedriver.exe");
        blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());
    }

    @Test
    public void fillFormList(){
        blazeDemoSite.formPage().goToWebsite().
                fillFirstNameBox("Anis Suba")
                .fillAddressTextBox("213 Dagenham bridge")
                .fillCityTextBox("Reading")
                .fillStateTextBox("London")
                .fillZipCode("1123")
                .fillCardType()
                .fillCardNumber("2132321312453567")
                .fillExpireMonth("11")
                .fillExpireYear("2022")
                .fillNameInCard("MR A SUBA")
                .tickRememberMe();
    }

    @Test
    public void selectFlightFromList(){
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDepartureCity().chooseDestinationCity().goToFindFlightPage().selectPlane();
        blazeDemoSite.formPage()
                .fillFirstNameBox("Anis Suba")
                .fillAddressTextBox("213 Dagenham bridge")
                .fillCityTextBox("Reading")
                .fillStateTextBox("London")
                .fillZipCode("1123")
                .fillCardType()
                .fillCardNumber("2132321312453567")
                .fillExpireMonth("11")
                .fillExpireYear("2022")
                .fillNameInCard("MR A SUBA")
                .tickRememberMe()
                .clickPurchaseFlightButton();
    }
}
