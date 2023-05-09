package com.nopcommerce.dem.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.dem.customlisteners.CustomListeners;
import com.nopcommerce.dem.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText ;
    @CacheLookup
    @FindBy(id="Email")
    WebElement emailField ;
    @CacheLookup
    @FindBy(name="Password")
    WebElement passwordField ;
    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Log in')]")
    WebElement loginButton ;
    @CacheLookup
    @FindBy(xpath="//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage ;
    public String getWelcomeText(){
        Reporter.log("Get Welcome Text" );
        CustomListeners.test.log(Status.PASS,"Get Welcome Text");
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        Reporter.log("Enter Email "+email );
        CustomListeners.test.log(Status.PASS,"Enter Eamil " + email);
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        Reporter.log("Enter Password " + password);
        CustomListeners.test.log(Status.PASS,"Enter Password " + password);
        sendTextToElement(passwordField,password);
    }
    public void clickOnLonginButton(){
        Reporter.log("Click on Login button" );
        CustomListeners.test.log(Status.PASS,"Click on Login button");
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        Reporter.log("Get Error Message" );
        CustomListeners.test.log(Status.PASS,"Get Error Message");
        return getTextFromElement(errorMessage);
    }

}
