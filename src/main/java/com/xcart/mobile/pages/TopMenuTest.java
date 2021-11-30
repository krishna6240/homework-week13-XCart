package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuTest extends Utility {
    By clickOnShipping = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//a[@href='shipping.html']//span[contains(text(),'Shipping')]");
    By clickONNewLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]");
    By clickOnComingSoon=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//a[@href='shipping.html']//span[contains(text(),'Shipping')]");
    By clickOnContactUs=By.xpath("(//span[contains(text(),'Contact us')])[2]");



    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
          clickOnElement(clickOnShipping);

    }
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
            clickOnElement(clickONNewLink);

    }
    public void veryfyUserShouldNavigateToComingSoonPageSuccessfully(){
          clickOnElement(clickOnComingSoon);

    }
    public void veryfyUserShouldNavigateToContactUsPageSuccessfully() {
              clickOnElement(clickOnContactUs);

    }
}
