package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsTest extends Utility {
    By hotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By saleLink = By.xpath("(//span[contains(text(),'Sale')])[2]");
    By sortBy = By.xpath("//span[@class='sort-by-label']");
    By clickOnAtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By clickOnPriceLowHigh = By.xpath("//a[normalize-space()='Price Low - High']");
    By clickOnRates = By.xpath("//a[@data-sort-by='r.rating']");
    By bestSellersLink = By.xpath("(//span[contains(text(),'Bestsellers')])[2]");
    By nameZtoA = By.xpath("//a[normalize-space()='Name Z - A']");
    By clickOnPriceHighLow = By.xpath("//a[normalize-space()='Price High - Low']");
    By clickOnBestSellerRates = By.xpath("//a[@data-sort-by='r.rating']");

    public void verifySaleProductArrangeAlphabetically(){
        mouseHoverToElement(hotDeals);
        clickOnElement(saleLink);
        mouseHoverToElement(sortBy);
        clickOnElement(clickOnAtoZ);
    }

    public void verifySaleProductsPriceArrangeLowToHigh(){
        mouseHoverToElement(hotDeals);
        clickOnElement(saleLink);
        mouseHoverToElement(sortBy);
        clickOnElement(clickOnPriceLowHigh);
    }

    public void verifySaleProductArrangeByRates(){
        mouseHoverToElement(hotDeals);
        clickOnElement(saleLink);
        mouseHoverToElement(sortBy);
        clickOnElement(clickOnRates);

    }
    public void  verifyBestSellersProductsArrangeByZToA() {
        mouseHoverToElement(hotDeals);
        clickOnElement(bestSellersLink);
        mouseHoverToElement(sortBy);
        clickOnElement(nameZtoA);

    }

    public  void   verifyBestSellersProductsPriceArrangeHighToLow(){
        mouseHoverToElement(hotDeals);
        clickOnElement(bestSellersLink);
        mouseHoverToElement(sortBy);
        clickOnElement(clickOnPriceHighLow);
    }
    public  void verifyBestSellersProductsArrangeByRates() {
        mouseHoverToElement(hotDeals);
        clickOnElement(bestSellersLink);
        mouseHoverToElement(sortBy);
        clickOnElement(clickOnBestSellerRates);
    }

}



