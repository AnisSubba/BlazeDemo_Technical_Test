package org.example.spartaglobal.technicalTest.BlazeDemo.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    private WebDriver driver;

    private By LogInEmailName = By.id("email");
    private By logInPassword = By.id("password");
    private By logInTickRememberMe = By.name("remember");
    private By logInLogInButton = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[4]/div/button");

    private String registerPageURL = "http://blazedemo.com/register";
    private By registerEnterName = By.id("name");
    private By registerEnterCompanyName = By.id("company");
    private By registerEnterEmail = By.id("email");
    private By registerEnterPassword = By.id("password");
    private By registerReEnterPassword = By.id("password-confirm");
    private By registerButton = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[6]/div/button");


    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public LogInPage fillInLogInEmail(String email){
        driver.findElement(LogInEmailName).sendKeys(email);
        return this;
    }

    public LogInPage fillInLogInPassword (String password){
        driver.findElement(logInPassword).sendKeys(password);
        return this;
    }

    public LogInPage tickRememberMe(){
        driver.findElement(logInTickRememberMe).click();
        return this;
    }

    public LogInPage clickLogInButton(){
        driver.findElement(logInLogInButton).click();
        return this;
    }

    public LogInPage goToRegisterPage(){
        driver.navigate().to(registerPageURL);
        return this;
    }

    public LogInPage fillRegisterName(String name){
        driver.findElement(registerEnterName).sendKeys(name);
        return this;
    }

    public LogInPage fillRegisterCompanyName(String companyName){
        driver.findElement(registerEnterCompanyName).sendKeys(companyName);
        return this;
    }

    public LogInPage fillRegisterEmail(String email){
        driver.findElement(registerEnterEmail).sendKeys(email);
        return this;
    }

    public LogInPage fillRegisterPassword(String password){
        driver.findElement(registerEnterPassword).sendKeys(password);
        return this;
    }

    public LogInPage fillRegisterReEnterPassword (String reEnterpassword){
        driver.findElement(registerReEnterPassword).sendKeys(reEnterpassword);
        return this;
    }

    public LogInPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return this;
    }





}
