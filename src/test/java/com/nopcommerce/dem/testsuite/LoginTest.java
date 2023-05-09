package com.nopcommerce.dem.testsuite;

import com.nopcommerce.dem.customlisteners.CustomListeners;
import com.nopcommerce.dem.pages.HomePage;
import com.nopcommerce.dem.pages.LoginPage;
import com.nopcommerce.dem.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {
    HomePage homePage ;
    LoginPage loginPage ;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        String expectedText ="Welcome, Please Sign In!";
        String acctualText = loginPage.getWelcomeText();
        Assert.assertEquals(acctualText,expectedText,"Login page not dispalyed");
    }

}
