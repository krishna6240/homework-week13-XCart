package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingTest extends Utility {
    By hoverOnHotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By clickOnSaleLInk1 = By.linkText("Sale");
    By veryfyTextSale = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By clickOnNameAtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By clickOnAvengers = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-16')]");
    By productAddedMessage = By.xpath("//li[text()='Product has been added to your cart']");
    By clickOnXSign = By.xpath("//a[@class='close']");
    By clickOnYourCart = By.xpath("//div[@title='Your cart']");
    By clickOnViewCart = By.xpath("//span[normalize-space()='View cart']");
    By veryfy1ItemMessage = By.id("page-title");
    By added2Items = By.xpath("//h1[text()='Your shopping cart - 2 items']");
    By subTotalVeryfy = By.xpath("//span[@class='cart-subtotal']/parent::li/ancestor::ul");
    By totalVeryFy = By.xpath("//li[@class='total']");
    By goToCheckOut = By.xpath("//span[text()='Go to checkout']");
    By logInYourAcc = By.xpath("//h3[text()='Log in to your account']");
    By enterEmail = By.id("email");
    By clickOnContinue = By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']");
    By veryFySecureCheckOut = By.xpath("//h1[@class='title']");
    By enterFirstName = By.id("shippingaddress-firstname");
    By enterLastName = By.id("shippingaddress-lastname");
    By enterAddress = By.id("shippingaddress-street");
    By enterState = By.id("shippingaddress-custom-state");
    By createAnAccForLaterUse = By.id("create_profile");
    By enterPassword = By.id("password");
    By mouseHoverToDeliveryMethod = By.id("method128");
    By clickOnMethod = By.id("method128");
    By clickOnCod = By.id("pmethod6");
    By veryfyFinalTotal = By.xpath("//div[@class='total clearfix']");
    By mouseHoverToClickButton = By.xpath("//span[text()='Place order: $37.03']/parent::button");
    By clickOnButton = By.xpath("//span[text()='Place order: $37.03']/parent::button");
    By veryFyThankYouMsg = By.xpath("//h1[@id='page-title']");
    //2 - verifyThatUserShouldClearShoppingCartSuccessfully()
    By clickOnBestSeller = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span");
    By veryFyBestSellerMsg = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy2 = By.xpath("//span[@class='sort-by-label']");
    By selectAToZ = By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[4]/a");
    By hoverOnVinzProduct = By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By clickOnVinzProducts = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By veryFyProductAddedMsg2 = By.xpath("//li[text()='Product has been added to your cart']");
    By clickOnXSig2 = By.xpath("//a[@class='close']");
    By clickOnYourCart2 = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By clickOnViewCart2 = By.xpath("//a[@class='regular-button cart']");
    By veryFyoneItemMsg = By.id("page-title");
    By clickOnEmptyCart = By.xpath("//a[text()='Empty your cart']");
    By itemsDeletedFromCart = By.xpath("//li[text()='Item(s) deleted from your cart']");
    By lastMessage = By.xpath("//h1[text()='Your cart is empty']");


    public void mouseHoverOnHotDeals() {
        mouseHoverToElement(hoverOnHotDeals);
    }

    public void clickOnSale() {
        clickOnElement(clickOnSaleLInk1);
    }

    public String getSaleMessage() {
        return getTextElement(veryfyTextSale);
    }

    public void hoverOnSortBy() {
        mouseHoverToElement(mouseHoverOnSortBy);
    }

    public void clickOnNameAToZ() {
        clickOnElement(clickOnNameAtoZ);
    }

    public void getClickOnAvengers() {

        clickOnElement(clickOnAvengers);
    }

    public String getProductAddedMessage() {

        return getTextElement(productAddedMessage);
    }

    public void getXSign() {

        clickOnElement(clickOnXSign);
    }

    public void getYourCartSign() {

        clickOnElement(clickOnYourCart);
    }

    public void getYourViewCartSign() {

        clickOnElement(clickOnViewCart);
    }

    public String get1ItemAdded() {

        return getTextElement(veryfy1ItemMessage);
    }

    public String getting2ItemsAddesMsg() {

        return getTextElement(added2Items);

    }

    public String gettingSubTotal() {

        return getTextElement(subTotalVeryfy);
    }

    public String gettingTotal() {

        return getTextElement(totalVeryFy);
    }

    public void gettingGoToCheckOut() {

        clickOnElement(goToCheckOut);
    }

    public String getLoginAcc() {

        return getTextElement(logInYourAcc);
    }

    public void getEmail(String email) {

        sendTextToElement(enterEmail, email);


    }

    public void getOnContinue() {
        clickOnElement(clickOnContinue);

    }

    public String getSecureCheckOut() {

        return getTextElement(veryFySecureCheckOut);
    }

    public void getFirstName(String name) {

        sendTextToElement(enterFirstName, name);
    }

    public void getLastName(String lastname) {

        sendTextToElement(enterLastName, lastname);
    }

    public void getAddress(String address) {

        sendTextToElement(enterAddress, address);
    }

    public void getState(String state) {

        sendTextToElement(enterState, state);
    }


    public void getClickOnAccLaterUse() {
        clickOnElement(createAnAccForLaterUse);
    }

    public void getpassword(String password) {

        sendTextToElement(enterPassword, password);
    }

    public void getDeliveryMethod() {

        mouseHoverToElement(mouseHoverToDeliveryMethod);
    }


    public void getClickOnMethod() {
        ;
        clickOnElement(clickOnMethod);
    }

    public void getClickOnCod() {

        clickOnElement(clickOnCod);
    }

    public String getFinalTotal() {

        return getTextElement(veryfyFinalTotal);
    }

    public void getMouseHoverToClick() {

        mouseHoverToElement(mouseHoverToClickButton);
    }

    public void getClickOnFinalButton() {

        clickOnElement(clickOnButton);
    }

    public String getThankYouMsg() {

        return getTextElement(veryFyThankYouMsg);
    }

    //2 - verifyThatUserShouldClearShoppingCartSuccessfully()
    public void getClickOnBestSeller() {

        clickOnElement(clickOnBestSeller);

    }

    public String getBestSellerText() {

        return getTextElement(veryFyBestSellerMsg);
    }

    public void getMouseHover2() {

        mouseHoverToElement(mouseHoverOnSortBy2);
    }

    public void getAtoZ2() {

        clickOnElement(selectAToZ);
    }

    public void hoverVinzProduct() {

        mouseHoverToElement(hoverOnVinzProduct);
    }

    public void getVinzProducts() {

        clickOnElement(clickOnVinzProducts);
    }

    public String getProductAddedMessage2() {

        return getTextElement(veryFyProductAddedMsg2);
    }

    public void getXSign2() {

        clickOnElement(clickOnXSig2);

    }

    public void getClickOnYourCart2() {

        clickOnElement(clickOnYourCart2);
    }

    public void getClickOnViewCart2() {

        clickOnElement(clickOnViewCart2);
    }

    public String getProductOneAddedMsg() {

        return getTextElement(veryFyoneItemMsg);
    }

    public void getEmptyCart2() {

        clickOnElement(clickOnEmptyCart);
    }

    public String getDeletesMsg() {

        return getTextElement(itemsDeletedFromCart);

    }

    public String getLastMessage() {

        return getTextElement(lastMessage);

    }


}

