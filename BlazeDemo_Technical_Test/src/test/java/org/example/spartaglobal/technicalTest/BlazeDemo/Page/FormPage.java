package org.example.spartaglobal.technicalTest.BlazeDemo.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.Normalizer;

public class FormPage {
    private WebDriver driver;
    private String formURL = "http://blazedemo.com/purchase.php";

    private By fullNameTextBox = By.id("inputName");
    private By addressTextBox = By.id("address");
    private By cityTextBox = By.id("city");
    private By stateTextBox = By.id("state");
    private By zipCodeTextBox = By.id("zipCode");
    private By cardNumber = By.id("creditCardNumber");
    private By cardExpireMonth = By.id("creditCardMonth");
    private By cardExpireYear = By.id("creditCardYear");
    private By nameOnCard = By.id("nameOnCard");
    private By rememberMeTickBox = By.id("rememberMe");
    private By purchaseFlightButton = By.xpath("/html/body/div[2]/form/div[11]/div/input");

    public FormPage(WebDriver driver){
        this.driver = driver;
    }

    public FormPage goToWebsite(){
        driver.navigate().to(formURL);
        return this;
    }

    public FormPage fillFirstNameBox(String fullName){
        driver.findElement(fullNameTextBox).sendKeys(fullName);
        return this;
    }

    public FormPage fillAddressTextBox(String addressName){
        driver.findElement(addressTextBox).sendKeys(addressName);
        return this;
    }

    public FormPage fillCityTextBox(String cityName){
        driver.findElement(cityTextBox).sendKeys(cityName);
        return this;
    }

    public FormPage fillStateTextBox(String stateName){
        driver.findElement(stateTextBox).sendKeys(stateName);
        return this;
    }

    public FormPage fillZipCode (String zipCode){
        driver.findElement(zipCodeTextBox).sendKeys(zipCode);
        return this;
    }
    
    public FormPage fillCardType (){
        WebElement from;
        for (int i = 1; i <= 3; i++ ){
            from = driver.findElement(By.xpath("/html/body/div[2]/form/div[6]/div/select/option["+i+"]"));
            from.click();
        }
        return this;
    }

    public FormPage fillCardNumber (String accountNumber){
        driver.findElement(cardNumber).sendKeys(accountNumber);
        return this;
    }

    public FormPage fillExpireMonth (String expireMonth){
        driver.findElement(cardExpireMonth).sendKeys(expireMonth);
        return this;
    }

    public FormPage fillExpireYear (String expireYear){
        driver.findElement(cardExpireYear).sendKeys(expireYear);
        return this;
    }

    public FormPage fillNameInCard (String accountHolderName){
        driver.findElement(nameOnCard).sendKeys(accountHolderName);
        return this;
    }

    public FormPage tickRememberMe (){
        driver.findElement(rememberMeTickBox).click();
        return this;
    }

    public FormPage clickPurchaseFlightButton (){
        driver.findElement(purchaseFlightButton).click();
        return this;
    }
}
