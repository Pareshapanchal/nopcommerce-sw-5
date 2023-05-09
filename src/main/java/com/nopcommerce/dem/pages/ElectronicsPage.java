package com.nopcommerce.dem.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.dem.customlisteners.CustomListeners;
import com.nopcommerce.dem.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics ;
    @CacheLookup
    @FindBy(xpath="//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhonesLink  ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Cell phones']")
    WebElement cellphoneText ;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='List']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020link;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement getNokiaLumia1020Text ;
    @CacheLookup
    @FindBy(xpath="//span[@id='price-value-20']")
    WebElement price$349Text ;
    @CacheLookup
    @FindBy(xpath="//input[@id='product_enteredQuantity_20']")
    WebElement quantity ;
    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-20']")
    WebElement addToCartButton ;
    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement productAddedText ;
    @CacheLookup
    @FindBy(xpath="//span[@title='Close']")
    WebElement crossButton ;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-label']")
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Go to cart']")
    WebElement goToCartButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
    WebElement shoppingCartTextAfterRegister;


    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
    WebElement quantityText ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]")
    WebElement totalText698;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]")
    WebElement totalText6981;
    @CacheLookup
    @FindBy(xpath="//span[@class='product-subtotal']")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 checkout-as-guest-button']")
    WebElement registernewButton;
    @CacheLookup
    @FindBy(xpath="//input[@id='FirstName']")
    WebElement firstNameField ;
    @CacheLookup
    @FindBy(xpath="//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath="//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath="//input[@id='Password']")
    WebElement passwordField ;
    @CacheLookup
    @FindBy(xpath="//input[@id='ConfirmPassword']")
    WebElement confirmPassword ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/button[1]")
    WebElement registrationButton;
    @CacheLookup
    @FindBy(xpath="//div[@class='result']")
    WebElement registrationCompleteText ;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Continue']")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath="//input[@name='Email']")
    WebElement loginEmailField;
    @CacheLookup
    @FindBy(xpath="//input[@name='Password']")
    WebElement loginPasswordField ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath="//input[@id='termsofservice']")
    WebElement termsAndConditionCheckbox ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/input[1]")
    WebElement termsAndConditionCheckbox1 ;

    @CacheLookup
    @FindBy(xpath="//button[@id='checkout']")
    WebElement checkoutButton ;
    @CacheLookup
    @FindBy(xpath="//button[@id='checkout']")
    WebElement checkoutButton1 ;
    @CacheLookup
    @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
    WebElement address1Field;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField ;
    @CacheLookup
    @FindBy(xpath="//button[@onclick='Billing.save()']")
    WebElement continueButtonBilling ;
    @CacheLookup
    @FindBy(xpath="//input[@id='shippingoption_2']")
    WebElement radioButton2ndDayAir;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButtonShipping ;
    @CacheLookup
    @FindBy(xpath="//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButtonatBillingAddress;
    @CacheLookup
    @FindBy(id="CreditCardType")
    WebElement cardOptions ;
    @CacheLookup
    @FindBy(xpath="//input[@id='CardholderName']")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(xpath="//input[@id='CardNumber']")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireMonth']")
    WebElement expiryMonthField;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireYear']")
    WebElement expiryYearField ;
    @CacheLookup
    @FindBy(xpath="//input[@id='CardCode']")
    WebElement cardCodeField ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonPaymentInfo;
    @CacheLookup
    @FindBy(xpath="//li[@class='payment-method']")
    WebElement paymentMethodText ;
    @CacheLookup
    @FindBy(xpath="//li[@class='shipping-method']")
    WebElement shippingMethodText ;
    @CacheLookup
    @FindBy(xpath="//span[@class='value-summary']")
    WebElement totalSummaryText ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Thank you']")
    WebElement thankYouText ;
    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderSuccessMessage ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonComplete;

    @CacheLookup
    @FindBy(xpath="//div[@class='topic-block-title']")
    WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(linkText="Log out")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignin ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Register']")
    WebElement registerText ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPaymentmethod ;

    //**********************************Action Methods***************************************
    public void mouseHoverOnElectronics(){
        Reporter.log("Mouse hover on Electronics" );
        CustomListeners.test.log(Status.PASS,"Mouse hover on Electronics");
        mouseHoverOnElement(electronics);
    }
    public void clickOnRegisterButton(){
        Reporter.log("Click on Register button" );
        CustomListeners.test.log(Status.PASS,"Click on Register button");
        clickOnElement(registerButton);
    }
    public void clickOnRegistrationButton(){
        Reporter.log("Click on Registration button" );
        CustomListeners.test.log(Status.PASS,"Click on Registration button");
        clickOnElement(registrationButton);
    }
    public void clickOnLoginLink(){
        Reporter.log("Click on Login link" );
        CustomListeners.test.log(Status.PASS,"Click on Login link");
        clickOnElement(loginLink);
    }

    public void mouseHoverAndClickOnCellPhones(){
        Reporter.log("Click on CellPhones" );
        CustomListeners.test.log(Status.PASS,"Click on CellPhones");
        mouseHoverOnElementAndClick(cellPhonesLink);
    }
    public void clickOnListView(){
        Reporter.log("Click on List view" );
        CustomListeners.test.log(Status.PASS,"Click on List view");
        clickOnElement(listView);
    }
    public void clickOnRadioButton2ndAir(){
        Reporter.log("Click on 2ndAir Radiao button" );
        CustomListeners.test.log(Status.PASS,"Click on 2ndAir Radiao button");
        clickOnElement(radioButton2ndDayAir);
    }
    public void clickOnNokiaLumia1020(){
        Reporter.log("Click on NokiaLumia1020" );
        CustomListeners.test.log(Status.PASS,"Click on NokiaLumia1020");
        clickOnElement(nokiaLumia1020link);
    }
    public void clickOnAddToCartButton(){
        Reporter.log("Click on ADDTOCART button" );
        CustomListeners.test.log(Status.PASS,"Click on ADDTOCART button");
        clickOnElement(addToCartButton);
    }
    public void mouseHoverOnShoppingCart(){
        Reporter.log("Mouse hover on Shopping Cart" );
        CustomListeners.test.log(Status.PASS,"Mouse hover on Shopping Cart");
        mouseHoverOnElement(shoppingCart);
    }
    public void clickOnContinueButtonShipping(){
        Reporter.log("Click on Continue button" );
        CustomListeners.test.log(Status.PASS,"Click on Continue button");
        clickOnElement(continueButtonShipping);
    }

    public void clickOnGoToCart(){
        Reporter.log("Click on GOTOCART button" );
        CustomListeners.test.log(Status.PASS,"Click on GOTOCART button");
        clickOnElement(goToCartButton);
    }
    public void clickOntermsAndConditionCheckbox(){
        Reporter.log("Click on TermsAndCondition checkbox" );
        CustomListeners.test.log(Status.PASS,"Click on TermsAndCondition checkbox");
        clickOnElement(termsAndConditionCheckbox);
    }
    public void clickOntermsAndConditionCheckbox1(){
        Reporter.log("Click on TermsAndCondition checkbox" );
        CustomListeners.test.log(Status.PASS,"Click on TermsAndCondition checkbox");
        clickOnElement(termsAndConditionCheckbox1);
    }
    public void clickOnCheckOutButton(){
        Reporter.log("Click on Checkout " );
        CustomListeners.test.log(Status.PASS,"Click on Checkout");
        clickOnElement(checkoutButton);
    }
    public void clickOnCheckOutButton1(){
        Reporter.log("Click on Checkout " );
        CustomListeners.test.log(Status.PASS,"Click on Checkout");
        clickOnElement(checkoutButton1);
    }
    public void clickOnRegisterLink(){
        Reporter.log("Click on Register Link" );
        CustomListeners.test.log(Status.PASS,"Click on Register Link");
        clickOnElement(registerLink);
    }
    public void clickOnContinueButton(){
        Reporter.log("Click on Continue button" );
        CustomListeners.test.log(Status.PASS,"Click on Continue button");
        clickOnElement(continueButton);
    }
    public void clickOnLoginbutton(){
        Reporter.log("Click on Login button" );
        CustomListeners.test.log(Status.PASS,"Click on Login button");
        clickOnElement(loginButton);
    }
   public void clickOnContinueButtonOnBillingPage(){
       Reporter.log("Click on Continue " );
       CustomListeners.test.log(Status.PASS,"Click on Continue ");
       clickOnElement(continueButtonBilling);
   }
   public void clickOnRadioButtonCrditCard(){
       Reporter.log("Click on CreditCard radio button" );
       CustomListeners.test.log(Status.PASS,"Click on CreditCard radio button");
       clickOnElement(creditCardRadioButton);
   }

    public void clickOnCrossButton(){
        Reporter.log("Click on Cross button" );
        CustomListeners.test.log(Status.PASS,"Click on Cross button");
        clickOnElement(crossButton);
    }
    public void clickOnContinueButtonPaymentInfo(){
        Reporter.log("Click on Continue" );
        CustomListeners.test.log(Status.PASS,"Click on Continue");

        clickOnElement(continueButtonPaymentInfo);
    }
    public void clickOnConfirmButton(){
        Reporter.log("Click on Continue" );
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(confirmButton);
    }
    public void clickOnContinueButtonCompleted(){
        Reporter.log("Click on Continue" );
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueButtonComplete);
    }
    public void clickOnLogoutLink(){
        Reporter.log("Click on Logout" );
        CustomListeners.test.log(Status.PASS,"Click on Logout");
        clickOnElement(logoutLink);
    }
    public void clickOnContinuePaymentMethod(){
        Reporter.log("Click on Continue" );
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueButtonPaymentmethod);
    }
    public void clickOnNokiaLumiaLink(){
        Reporter.log("Click on NokiaLlumia" );
        CustomListeners.test.log(Status.PASS,"Click on NokiaLlumia");
        clickOnElement(nokiaLumia1020link);
    }



    //**********************************Get Values Methods***********************************
    public String getCellphonesText(){
        Reporter.log("Get CellPhone Text" );
        CustomListeners.test.log(Status.PASS,"Get CellPhone Text");
        return getTextFromElement(cellphoneText);
    }
    public String getQuantityText(){
        Reporter.log("Get Quantity" );
        CustomListeners.test.log(Status.PASS,"Get Quantity");
        return quantityText.getAttribute("value");
    }
    public String getNokialumia1020Text(){
        Reporter.log("Get Nokialumia1020 Text" );
        CustomListeners.test.log(Status.PASS,"Get Nokialumia1020 Text");
        return getTextFromElement(getNokiaLumia1020Text);
    }
    public String getProductAddedMessage(){
        Reporter.log("Get ProductAdded Message" );
        CustomListeners.test.log(Status.PASS,"Get ProductAdded Message");
        return getTextFromElement(productAddedText);
    }
    public String getPrice349(){
        Reporter.log("Get Price349" );
        CustomListeners.test.log(Status.PASS,"Get Price349");
        return getTextFromElement(price$349Text);
    }
    public String getTotalSummary(){
        Reporter.log("Get Total" );
        CustomListeners.test.log(Status.PASS,"Get Total");
        return getTextFromElement(totalSummaryText);
    }
    public String getShoppingCartText(){
        Reporter.log("Get Shopping Cart text" );
        CustomListeners.test.log(Status.PASS,"Get Shopping Cart text");
        return getTextFromElement(shoppingCartText); }
    public String getTotal698Text1(){
        Reporter.log("Get Total 698 text" );
        CustomListeners.test.log(Status.PASS,"Get Total 698 text");
        return getTextFromElement(totalText6981); }
    public String getTotal698Text(){
        Reporter.log("Get Total 698 text" );
        CustomListeners.test.log(Status.PASS,"Get Total 698 text");
        return getTextFromElement(totalText698); }
    public String getWelcomeSignInText(){
        Reporter.log("Get Welcome Sign in text" );
        CustomListeners.test.log(Status.PASS,"Get Welcome Sign in text");
        return getTextFromElement(welcomeSignin);}
    public String getRegistrationCompleteText(){
        Reporter.log("Get Registration Complete text" );
        CustomListeners.test.log(Status.PASS,"Get Registration Complete text");
        return getTextFromElement(registrationCompleteText); }
    public String getShoppinCartTextAfterRegister(){
        Reporter.log("Get Shopping Cart text" );
        CustomListeners.test.log(Status.PASS,"Get Shopping Cart text");
        return getTextFromElement(shoppingCartTextAfterRegister); }
    public String getPaymentMethodText(){
        Reporter.log("Get Payment Method text" );
        CustomListeners.test.log(Status.PASS,"Get Payment Method text");
        return getTextFromElement(paymentMethodText); }
    public String getShippingMethodText(){
        Reporter.log("Get Shipping Method text" );
        CustomListeners.test.log(Status.PASS,"Get Shipping Method text");
        return getTextFromElement(shippingMethodText);}
    public String getTotal(){
        Reporter.log("Get Total" );
        CustomListeners.test.log(Status.PASS,"Get Total");
        return getTextFromElement(totalText); }
    public String getThankYouText(){
        Reporter.log("Get Thank You text" );
        CustomListeners.test.log(Status.PASS,"Get Thank You text");
        return getTextFromElement(thankYouText); }
    public String getYourOrderMessage(){
        Reporter.log("Get Your order message" );
        CustomListeners.test.log(Status.PASS,"Get Your order message");
        return getTextFromElement(orderSuccessMessage); }
    public String getWelcomeStoreText(){
        Reporter.log("Get Welcome Store" );
        CustomListeners.test.log(Status.PASS,"Get Welcome Store");
        return getTextFromElement(welcomeStoreText);   }
    public String getRegisterText(){
        Reporter.log("Get Register Text" );
        CustomListeners.test.log(Status.PASS,"Get Register Text");
        return getTextFromElement(registerText);
    }
    //**********************************Send Values Methods**********************************
    public void changeQuantity(String qty){
        Reporter.log("Change Quantity "+qty );
        CustomListeners.test.log(Status.PASS,"Change Quantity "+qty);
        clearTheBox(quantity);
        sendTextToElement(quantity,qty);
    }
    public void fillFirstNameLastNameField(String firstname,String lastname){
        Reporter.log("Enter FirstName and LastName" );
        CustomListeners.test.log(Status.PASS,"Enter FirstName and LastName");
        sendTextToElement(firstNameField,firstname);
        sendTextToElement(lastNameField,lastname);
    }
    public void fillEmailField(String email){
        Reporter.log("Enter Email " );
        CustomListeners.test.log(Status.PASS,"Enter Email ");
        sendTextToElement(emailField,email);
    }
    public void fillPasswordAndConfirmPassword(String password,String confirmpassword){
        Reporter.log("Enter Password and Confirm Password");
        CustomListeners.test.log(Status.PASS,"Enter Password and Confirm Password");
        sendTextToElement(passwordField,password);
        sendTextToElement(confirmPassword,confirmpassword);
    }
    public void fillEmailFieldInLoginPage(String email){
        Reporter.log("Enter Email" );
        CustomListeners.test.log(Status.PASS,"Enter Email");
        sendTextToElement(loginEmailField,email);
    }
    public void fillPasswordInLoginpage(String password){
        Reporter.log("Enter password " );
        CustomListeners.test.log(Status.PASS,"Enter password ");
        sendTextToElement(loginPasswordField,password);
    }
    public void fillAdress1(String address){
        Reporter.log("Enter firstline of Address" );
        CustomListeners.test.log(Status.PASS,"Enter firstline of Address");
        sendTextToElement(address1Field,address);
    }
    public void fillCountry(String country){
        Reporter.log("Enter country" );
        CustomListeners.test.log(Status.PASS,"Enter country");
       selectByVisibleTextFromDropDown(countryField,country);
    }
    public void fillCity(String city){
        Reporter.log("Enter City" );
        CustomListeners.test.log(Status.PASS,"Enter City");
        sendTextToElement(cityField,city);
    }
    public void fillPostCode(String postcode){
        Reporter.log("Enter PostCode" );
        CustomListeners.test.log(Status.PASS,"Enter PostCode");
        sendTextToElement(postCodeField,postcode);
    }
    public void fillPhoneNumber(String phonenumber){
        Reporter.log("Enter Telephonenumber" );
        CustomListeners.test.log(Status.PASS,"Enter Telephonenumber");
        sendTextToElement(phoneNumberField,phonenumber);
    }
    public void fillCardHolderNameField(String name){
        Reporter.log("Enter CardHolderName" );
        CustomListeners.test.log(Status.PASS,"Enter CardHolderName");
        sendTextToElement(cardHolderNameField,name);
    }
    public void fillCardNumberField(String cardnumber){
        Reporter.log("Enter CardNumber" );
        CustomListeners.test.log(Status.PASS,"Enter CardNumber");
        sendTextToElement(cardNumberField,cardnumber);
    }
    public void fillExpiryMonthField(String month){
        Reporter.log("Enter Expiry Month" );
        CustomListeners.test.log(Status.PASS,"Enter Expiry Month");
        sendTextToElement(expiryMonthField,month);
    }
    public void fillExpiryYearField(String year){
        Reporter.log("Enter Expiry year" );
        CustomListeners.test.log(Status.PASS,"Enter Expiry year");
        sendTextToElement(expiryYearField,year);
    }
    public void fillCardcodeField(String cardcode){
        Reporter.log("Enter Card Code" );
        CustomListeners.test.log(Status.PASS,"Enter Card Code");
        sendTextToElement(cardCodeField,cardcode);
    }
    //**********************************Select From DropDownMethods**************************
    public void selectVisaFromDropdown(String cardtype){
        Reporter.log("Select Visa from dropdown" );
        CustomListeners.test.log(Status.PASS,"Select Visa from dropdown");
        selectByContainsTextFromDropDown(cardOptions,cardtype);
    }


}

