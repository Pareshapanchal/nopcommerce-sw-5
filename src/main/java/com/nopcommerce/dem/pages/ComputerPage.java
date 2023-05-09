package com.nopcommerce.dem.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.dem.customlisteners.CustomListeners;
import com.nopcommerce.dem.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computer ;
    @CacheLookup
    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
     WebElement desktop ;
    @CacheLookup
    @FindBy(xpath="//select[@name='products-orderby']")
    WebElement positionDropDown ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//h2[@class='product-title']"))
    List<WebElement> productTitle ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnTitle ;
    @CacheLookup
    @FindBy(xpath="//select[@id='product_attribute_1']")
    WebElement processor ;
    @CacheLookup
    @FindBy(xpath="//select[@id='product_attribute_2']")
    WebElement ram ;
    @CacheLookup
    @FindBy(xpath="//input[@id='product_attribute_3_7']")
    WebElement hdd ;
    @CacheLookup
    @FindBy(xpath="//input[@id='product_attribute_4_9']")
    WebElement vistaPremium ;
    @CacheLookup
    @FindBys(@FindBy(xpath="//input[@type='checkbox']"))
    List<WebElement> selectSoftware ;
    @CacheLookup
    @FindBy(xpath="//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander ;
    @CacheLookup
    @FindBy(xpath="//span[@class='price-value-1']")
    WebElement productPrice ;
    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-1']")
    WebElement addToCart ;
    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement productAddedToCartMessage ;
    @CacheLookup
    @FindBy(xpath="//span[@title='Close']")
    WebElement closeTheBarButton;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-label']")
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Go to cart']")
    WebElement gotoCart ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartMessage ;
    @CacheLookup
    @FindBy(xpath="//input[@class='qty-input']")
    WebElement quantity ;
    @CacheLookup
    @FindBy(id="updatecart")
    WebElement updateCartButton ;
    @CacheLookup
    @FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']")
    WebElement total;
    @CacheLookup
    @FindBy(id="termsofservice")
    WebElement tearmsAndCondition ;
    @CacheLookup
    @FindBy(id="checkout")
    WebElement checkoutButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeMessage ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Checkout as Guest']")
    WebElement checkOutAsGuestButton ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
    WebElement lastName ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Email']")
    WebElement email ;
    @CacheLookup
    @FindBy(xpath="//select[@name='BillingNewAddress.CountryId']")
    WebElement country ;
    @CacheLookup
    @FindBy(xpath="//select[@name='BillingNewAddress.StateProvinceId']")
    WebElement state ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_City']")
    WebElement city ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
    WebElement address1 ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCode ;
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber ;
    @CacheLookup
    @FindBy(xpath="//button[@onclick='Billing.save()']")
    WebElement continueButton ;
    @CacheLookup
    @FindBy(id="shippingoption_1")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueButton ;
    @CacheLookup
    @FindBy(id="paymentmethod_1")
    WebElement creditCardRadioButton ;

    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButtonPaymentMethod ;
    @CacheLookup
    @FindBy(xpath="//select[@id='CreditCardType']")
    WebElement masterCard ;
    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardHolderName ;
    @CacheLookup
    @FindBy(id="CardNumber")
    WebElement cardNumber ;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireMonth']")
    WebElement cardExpiryMonth ;
    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireYear']")
    WebElement cardYear ;
    @CacheLookup
    @FindBy(id="CardCode")
    WebElement cardCode ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButtonPaymentInfo ;
    @CacheLookup
    @FindBy(xpath="//li[@class='payment-method']")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath="//li[@class='shipping-method']")
    WebElement shippingMethodMessage ;
    @CacheLookup
    @FindBy(xpath="//span[@class='value-summary']")
    WebElement totalCost ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmButton ;
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Thank you']")
    WebElement thankYouText ;
    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderSuccessfully ;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButtonOrderComplete ;
    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeStore ;
    public void clickOnComputerFromTopMenu(){
        Reporter.log("clickOnComputerFromTopMenu" );
        CustomListeners.test.log(Status.PASS,"clickOnComputerFromTopMenu");
        mouseHoverOnElement(computer); }
    public void clickOnDesktop(){
        Reporter.log("clickOnDesktop" );
        CustomListeners.test.log(Status.PASS,"clickOnDesktop");
        mouseHoverOnElementAndClick(desktop); }
    public List<String> getExpectedList(){
        Reporter.log("getExpectedList" );
        CustomListeners.test.log(Status.PASS,"getExpectedList");

        List<String> expectedTitle = getTheListOfElementFromTheList(productTitle);
        Collections.sort(expectedTitle);
        return expectedTitle;
    }
    public void sortTheDisplayTitlesFromSortBy(String text){
        Reporter.log("sortTheDisplayTitlesFromSortBy" );
        CustomListeners.test.log(Status.PASS,"sortTheDisplayTitlesFromSortBy");

        selectByVisibleTextFromDropDown(positionDropDown,text);
    }
    public void waitUntilTheSortByOptionSelection(){

        //waitUntilVisibilityOfElementLocated(positionDropDown,200);
    }
    public List<String> getAcctualList(){
        Reporter.log("getAcctualList" );
        CustomListeners.test.log(Status.PASS,"getAcctualList");

        List<String> acctualList = getTheListOfElementFromTheList(productTitle);
                return acctualList;
    }
    public void clickOnAddtoCart(){
        Reporter.log("clickOnAddtoCart" );
        CustomListeners.test.log(Status.PASS,"clickOnAddtoCart");
        clickOnElement(addToCartButton);  }
    public void clickOnAddToCartTotal(){

        Reporter.log("clickOnAddToCartTotal" );
        CustomListeners.test.log(Status.PASS,"clickOnAddToCartTotal");
        clickOnElement(addToCart);
    }
    public String getAcctualTitle(){
        Reporter.log("getAcctualTitle" );
        CustomListeners.test.log(Status.PASS,"getAcctualTitle");

        String acctualTitle = getTextFromElement(buildYourOwnTitle);
        return acctualTitle;
    }
    public void selectProcessor(String processorTitle)
    {Reporter.log("selectProcessor" );
        CustomListeners.test.log(Status.PASS,"selectProcessor");

        selectByVisibleTextFromDropDown(processor,processorTitle);
    }
    public void selectRam(String ramTitle){
        Reporter.log("selectRam" );
        CustomListeners.test.log(Status.PASS,"selectRam");

        selectByVisibleTextFromDropDown(ram,ramTitle);}
    public void selectHdd(){
        Reporter.log("selectHdd" );
        CustomListeners.test.log(Status.PASS,"selectHdd");

        clickOnElement(hdd);
    }
    public void selectOS(){
        Reporter.log("selectOS" );
        CustomListeners.test.log(Status.PASS,"selectOS");

        clickOnElement(vistaPremium);
    }
    public void setSelectSoftware(String softwareName){
        Reporter.log("Select Software" );
        CustomListeners.test.log(Status.PASS,"Select Software");

        selectAndClickOnTheElementFromTheList(selectSoftware,softwareName);
    }
    public void clickOnTotalCommander()
    {
        Reporter.log("clickOnTotalCommander" );
        CustomListeners.test.log(Status.PASS,"clickOnTotalCommander");

        clickOnElement(softwareTotalCommander);
    }
    public String getActualProductPrice(){

        Reporter.log("getActualProductPrice" );
        CustomListeners.test.log(Status.PASS,"getActualProductPrice");

        return getTextFromElement(productPrice);
    }
    public String getActualProductAddedMessage(){

        Reporter.log("getActualProductAddedMessage" );
        CustomListeners.test.log(Status.PASS,"getActualProductAddedMessage");

        return getTextFromElement(productAddedToCartMessage);
    }
    public void setCloseTheBarButton() {
        Reporter.log("setCloseTheBarButton" );
        CustomListeners.test.log(Status.PASS,"setCloseTheBarButton");

        clickOnElement(closeTheBarButton);
    }
    public void gotoSoppingCart() {
        Reporter.log("gotoSoppingCart" );
        CustomListeners.test.log(Status.PASS,"gotoSoppingCart");

        mouseHoverOnElement(shoppingCart);
    }
    public void clickOnGoToCart() {
        Reporter.log("clickOnGoToCart" );
        CustomListeners.test.log(Status.PASS,"clickOnGoToCart");

        clickOnElement(gotoCart);
    }
    public String getShoppingCartMessage(){
        Reporter.log("getShoppingCartMessage" );
        CustomListeners.test.log(Status.PASS,"getShoppingCartMessage");

        return getTextFromElement(shoppingCartMessage);
    }
    public void changeQuantity(String value ){
        Reporter.log("changeQuantity" );
        CustomListeners.test.log(Status.PASS,"changeQuantity");

        clearTheBox(quantity);
        sendTextToElement(quantity,value);
    }
    public void clickOnUpdateShoppingCartButton(){
        Reporter.log("clickOnUpdateShoppingCartButton" );
        CustomListeners.test.log(Status.PASS,"clickOnUpdateShoppingCartButton");

        clickOnElement(updateCartButton);
    }
    public String getTotal(){
        Reporter.log("getTotal" );
        CustomListeners.test.log(Status.PASS,"getTotal");

        return getTextFromElement(total);
    }
    public void clickOnTearmsAndCondition(){
        Reporter.log("clickOnTearmsAndCondition" );
        CustomListeners.test.log(Status.PASS,"clickOnTearmsAndCondition");

        clickOnElement(tearmsAndCondition);
}
    public void clickOnCheckoutButton(){
        Reporter.log("clickOnCheckoutButton" );
        CustomListeners.test.log(Status.PASS,"clickOnCheckoutButton");

        clickOnElement(checkoutButton);
}
    public String getWelcomeMessage(){
        Reporter.log("getWelcomeMessage" );
        CustomListeners.test.log(Status.PASS,"getWelcomeMessage");

        return getTextFromElement(welcomeMessage); }

    public void clickOnCheckoutAsGuest(){
        Reporter.log("clickOnCheckoutAsGuest" );
        CustomListeners.test.log(Status.PASS,"clickOnCheckoutAsGuest");

        clickOnElement(checkOutAsGuestButton);
    }
    public void fillFirstnameLastnameEmailPhonenumber(String firstname, String lastname, String email1, String phonenumber){
        Reporter.log("fillFirstnameLastnameEmailPhonenumber" );
        CustomListeners.test.log(Status.PASS,"");

        sendTextToElement(firstName,firstname);
        sendTextToElement(lastName,lastname);
        sendTextToElement(email,email1);
        sendTextToElement(phoneNumber,phonenumber);
    }
    public void fillCountry(String country1){
        Reporter.log("fillCountry" );
        CustomListeners.test.log(Status.PASS,"fillCountry");

        selectByVisibleTextFromDropDown(country,country1);}
    public void fillState(String state1){

        Reporter.log("fillState" );
        CustomListeners.test.log(Status.PASS,"fillState");

        selectByVisibleTextFromDropDown(state,state1);
    }
    public void fillCity(String city1)
    {Reporter.log("fillCity" );
        CustomListeners.test.log(Status.PASS,"fillCity");

        sendTextToElement(city,city1);
    }
    public void fillFirstlineAddressPostcode(String firstlineaddress,String postcode){
        Reporter.log("fillFirstlineAddressPostcode" );
        CustomListeners.test.log(Status.PASS,"fillFirstlineAddressPostcode");

        sendTextToElement(address1,firstlineaddress);
        sendTextToElement(postCode,postcode);
    }
    public void clickOnContinueButton(){
        Reporter.log("clickOnContinueButton" );
        CustomListeners.test.log(Status.PASS,"clickOnContinueButton");
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAir(){
        Reporter.log("clickOnNextDayAir" );
        CustomListeners.test.log(Status.PASS,"clickOnNextDayAir");
        clickOnElement(nextDayAir);
    }
    public void clickOnContinueButtonPayementMethodPage(){
        Reporter.log("clickOnContinueButtonPayementMethodPage" );
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonPayementMethodPage");
        clickOnElement(continueButtonPaymentMethod);
    }
    public void clickOnContinueButtonShipping(){
        Reporter.log("clickOnContinueButtonShipping" );
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonShipping");
        clickOnElement(shippingContinueButton);
    }
    public void clickOnCreditCardRadioButton(){
        Reporter.log("clickOnCreditCardRadioButton" );
        CustomListeners.test.log(Status.PASS,"clickOnCreditCardRadioButton");
        clickOnElement(creditCardRadioButton);
    }
    public void clickOnContinueButtonPaymentMethod(){
        Reporter.log("clickOnContinueButtonPaymentMethod" );
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonPaymentMethod");
        clickOnElement(continueButtonPaymentMethod);
    }
    public void selectMasterCardFromSelectCreditCard(){
        Reporter.log("selectMasterCardFromSelectCreditCard" );
        CustomListeners.test.log(Status.PASS,"selectMasterCardFromSelectCreditCard");
        selectByVisibleTextFromDropDown(masterCard,"Master card");
    }
    public void sendCardHolderNameAndCardNumber(String name, String creditcardnumber){
        Reporter.log("sendCardHolderNameAndCardNumber" );
        CustomListeners.test.log(Status.PASS,"sendCardHolderNameAndCardNumber");
        sendTextToElement(cardHolderName,name);
        sendTextToElement(cardNumber,creditcardnumber);
    }
    public void sendCardExpiryMonthAndYear(String month, String year){
        Reporter.log("sendCardExpiryMonthAndYear" );
        CustomListeners.test.log(Status.PASS,"sendCardExpiryMonthAndYear");
        selectByVisibleTextFromDropDown(cardExpiryMonth,month);
        selectByVisibleTextFromDropDown(cardYear,year);
    }
    public void sendCardCode(String cCode){
        Reporter.log("sendCardCode" );
        CustomListeners.test.log(Status.PASS,"sendCardCode");
        sendTextToElement(cardCode,cCode);
    }
    public void clickOnContinueButtonOnPaymentInfoPage(){
        Reporter.log("clickOnContinueButtonOnPaymentInfoPage" );
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonOnPaymentInfoPage");
        clickOnElement(continueButtonPaymentInfo);
    }
    public String getPaymentMethodIsCreditCard(){
        Reporter.log("getPaymentMethodIsCreditCard" );
        CustomListeners.test.log(Status.PASS,"getPaymentMethodIsCreditCard");
        return getTextFromElement(paymentMethod);
    }
    public String getShippingMethodIsNextDayAir(){
        Reporter.log("getShippingMethodIsNextDayAir" );
        CustomListeners.test.log(Status.PASS,"getShippingMethodIsNextDayAir");
        return getTextFromElement(shippingMethodMessage);
    }
    public String getTotalAmount(){
        Reporter.log("getTotalAmount" );
        CustomListeners.test.log(Status.PASS,"getTotalAmount");
        return getTextFromElement(totalCost);
    }
    public void clickOnConfirmButton(){
        Reporter.log("clickOnConfirmButton" );
        CustomListeners.test.log(Status.PASS,"clickOnConfirmButton");
        clickOnElement(confirmButton);
    }
    public String getThankYouText(){
        Reporter.log("getThankYouText" );
        CustomListeners.test.log(Status.PASS,"getThankYouText");
        return getTextFromElement(thankYouText);
    }
    public String getOrderSuccessfullyMessage(){
        Reporter.log("getOrderSuccessfullyMessage" );
        CustomListeners.test.log(Status.PASS,"getOrderSuccessfullyMessage");
        return getTextFromElement(orderSuccessfully);
    }
    public void clickOnContinueButtonOrderComplete(){
        Reporter.log("clickOnContinueButtonOrderComplete" );
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonOrderComplete");
        clickOnElement(continueButtonOrderComplete);
    }
    public String getWelcomeStoreMessage(){
        Reporter.log("getWelcomeStoreMessage" );
        CustomListeners.test.log(Status.PASS,"getWelcomeStoreMessage");
        return getTextFromElement(welcomeStore);
    }





}
