package com.nopcommerce.dem.testsuite;

import com.nopcommerce.dem.customlisteners.CustomListeners;
import com.nopcommerce.dem.pages.TopMenuPage;
import com.nopcommerce.dem.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage ;
    String menu = "Computers";
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        topMenuPage = new TopMenuPage();
    }
    @Test(groups = {"sanity","regression"})
    //This method will click on the selected title from the menu list
    // and verify the navigation of the page
    public void verifyPageNavigation()throws InterruptedException{

        topMenuPage.selectMenu(menu);

        String acctualPageTitle = topMenuPage.getPageTitle();
        String expectedPageTitle = menu;
        Assert.assertEquals(acctualPageTitle,expectedPageTitle,"Title doesn't match");
    }


}


