package org.example.spartaglobal.technicalTest.StepDefs;

import io.cucumber.java.en.*;
import org.example.spartaglobal.technicalTest.BlazeDemo.BlazeDemoSite;
import org.example.spartaglobal.technicalTest.SeleniumConfig.SeleniumConfig;

public class BookDestinationStepDefs {

    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","D:\\anis\\spartaglobal\\Engineering43\\chromedriver_win32\\chromedriver.exe");
    private static BlazeDemoSite blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());

    //As a user I am able to select departure and destination city
    @Given("I am on the travel home page")
    public void i_am_on_the_travel_home_page() {
        blazeDemoSite.getDestinationPage().goToDestinationPageURL();
    }

    @When("I select my departure city location")
    public void i_select_my_departure_city_location() {
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDepartureCity();
    }

    @And("I select my destination location")
    public void i_select_my_destination_location() {
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDestinationCity();
    }

    @Then("I click the submit button")
    public void i_click_the_submit_button() {
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().goToFindFlightPage();
    }

    @Given("I clicked the submit button")
    public void i_clicked_the_submit_button() {
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDepartureCity().chooseDestinationCity().goToFindFlightPage();
    }

    //As a User I can choose the flight I find suitable
    @When("I can see all the list of suitable flight")
    public void i_can_see_all_the_list_of_suitable_flight() {
    }

    @Then("I click on the suitable flight which will open the detail page")
    public void i_click_on_the_suitable_flight_which_will_open_the_detail_page() {
        blazeDemoSite.getDestinationPage().selectPlane();
    }

    // As a User I am able to fill out the detail
    @Given("I clicked on the suitable flight which will open the detail page")
    public void i_clicked_on_the_suitable_flight_which_will_open_the_detail_page() {
        blazeDemoSite.getDestinationPage().goToDestinationPageURL().chooseDepartureCity().chooseDestinationCity().goToFindFlightPage().selectPlane();
    }

    @When("I fill out the detail")
    public void i_fill_out_the_detail() {
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
            .fillNameInCard("MR A SUBA");
    }

    @When("I click on remember me and purchase flight")
    public void i_click_on_remember_me_and_purchase_flight() {
        blazeDemoSite.formPage().goToWebsite()
                .tickRememberMe()
                .clickPurchaseFlightButton();
    }

    @Then("I will be able to see the confirmation page")
    public void i_will_be_able_to_see_the_confirmation_page() {
    }

}
