package com.nopcommerce.dem.pages;
import com.aventstack.extentreports.Status;
import com.nopcommerce.dem.customlisteners.CustomListeners;
import com.nopcommerce.dem.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;
import java.util.List;

public class TopMenuPage extends Utility {
    //This xpath will give you list of titles on the top menu bar
    @CacheLookup
    @FindBys(@FindBy(xpath="//ul[@class='top-menu notmobile']/li"))
    List<WebElement> topMenuList ;
    //This xpath will give you title of the page
    @CacheLookup
    @FindBy(xpath="//div[@class='page-title']")
    WebElement pageTitle ;
    //This method will select title from the top menu bar
    public void selectMenu(String menu) {
        Reporter.log("Select Menu" );
        CustomListeners.test.log(Status.PASS,"Select Menu");
        selectAndClickOnTheElementFromTheList(topMenuList,menu);
    }
    //This method will return the title of the page
    public String getPageTitle(){
        Reporter.log("Get Page Title" );
        CustomListeners.test.log(Status.PASS,"Get Page Title");
        return getTextFromElement(pageTitle);
    }
}
