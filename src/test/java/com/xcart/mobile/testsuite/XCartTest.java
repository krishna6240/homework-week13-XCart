package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.HotDealsTest;
import com.xcart.mobile.pages.ShoppingTest;
import com.xcart.mobile.pages.TopMenuTest;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XCartTest extends TestBase {
    TopMenuTest topMenuTest = new TopMenuTest();
    HotDealsTest hotDealsTest = new HotDealsTest();
    ShoppingTest shoppingTest = new ShoppingTest();

    @Test
    public void NavigateToShippingPageTest() throws InterruptedException {
        topMenuTest.verifyUserShouldNavigateToShippingPageSuccessfully();
        String expectedText = "Shipping";
        WebElement ActualText = driver.findElement(By.xpath("(//span[contains(text(),'Shipping')])[2]"));
        String RealText = ActualText.getText();
        Assert.assertEquals(expectedText, RealText, "Verify the text is not match");
        Thread.sleep(2000);
    }

    @Test
    public void NavigateToNewPageTest() {
        topMenuTest.verifyUserShouldNavigateToNewPageSuccessfully();
        String expectedText1 = "New arrivals";
        WebElement ActualText1 = driver.findElement(By.xpath("//h1[@id='page-title']"));
        String RealText1 = ActualText1.getText();
        Assert.assertEquals(expectedText1, RealText1, "Verify the text is not match");
    }

    @Test
    public void NavigateToCominSoonpage() {
        topMenuTest.veryfyUserShouldNavigateToComingSoonPageSuccessfully();
        String expectedText2 = "Coming soon";
        WebElement ActualText2 = driver.findElement(By.xpath("(//span[contains(text(),'Coming soon')])[2]"));
        String RealText2 = ActualText2.getText();
        Assert.assertEquals(expectedText2, RealText2, "Verify the text is not match");

    }

    @Test
    public void NavigateToContactUsPage() {
        topMenuTest.veryfyUserShouldNavigateToContactUsPageSuccessfully();
        String expectedText3 = "Contact us";
        WebElement ActualText3 = driver.findElement(By.xpath("(//span[contains(text(),'Contact us')])[2]"));
        String RealText3 = ActualText3.getText();
        Assert.assertEquals(expectedText3, RealText3, "Verify the text is not match");
    }

    //These test are for hotdeals
    @Test
    public void productArrangeAlphabeticallyTest() {
        hotDealsTest.verifySaleProductArrangeAlphabetically();
        String saleMsg = "Sale";
        String actualSalesMsg = getTextElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals( saleMsg, actualSalesMsg,"UserIs Not On Sales Page");
        String expectedFirstDisplayMsg = "Name A - Z";
        String actualFirstDisplayMsg = getTextElement(By.xpath("//span[text()='Name A - Z']"));
        Assert.assertEquals( expectedFirstDisplayMsg, actualFirstDisplayMsg,"products are  In Alphabetical Order");
    }
    @Test
    public void productPriceToLowToHighTest() {
        hotDealsTest.verifySaleProductsPriceArrangeLowToHigh();
        String saleMsg = "Sale";
        String actualSalesMsg = getTextElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Sales Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Price Low - High";
        String actualSortByMsg = getTextElement(By.xpath("//span[text()='Price Low - High']"));
        Assert.assertEquals( expectedSortByMsg, actualSortByMsg,"Products Are Not Sorted In price Low to High");
    }
    @Test
    public void productArrangeToRatesTest() {
        hotDealsTest.verifySaleProductArrangeByRates();
        String saleMsg = "Sale";
        String actualSalesMsg = getTextElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Sales Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Rates";
        String actualSortByMsg = getTextElement(By.xpath("//span[text()='Rates ']"));
        Assert.assertEquals( expectedSortByMsg, actualSortByMsg,"Products Are Not Sorted In Rates");
    }
    @Test
    public void productArrangeToZToA(){
        hotDealsTest.verifyBestSellersProductsArrangeByZToA();
        String saleMsg = "Bestsellers";
        String actualSalesMsg = getTextElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Best Sellers Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Name Z - A";
        String actualSortByMsg = getTextElement(By.xpath("//span[text()='Name Z - A']"));
        Assert.assertEquals( expectedSortByMsg, actualSortByMsg,"Products Are Not Sorted In Rates");
    }
    @Test
    public void ProductArrangeToHighToLow() {
        hotDealsTest.verifyBestSellersProductsPriceArrangeHighToLow();
        String saleMsg = "Bestsellers";
        String actualSalesMsg = getTextElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Best Sellers Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Price High - Low";
        String actualSortByMsg = getTextElement(By.xpath("//span[text()='Price High - Low']"));
        Assert.assertEquals( expectedSortByMsg, actualSortByMsg,"Products Are Not Sorted In Rates");
    }
    @Test
    public void productArrangeToRatesbestseller() {
        hotDealsTest.verifyBestSellersProductsArrangeByRates();
        String saleMsg = "Bestsellers";
        String actualSalesMsg = getTextElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Best Sellers Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Rates";
        String actualSortByMsg = getTextElement(By.xpath("//span[text()='Rates ']"));
        Assert.assertEquals( expectedSortByMsg, actualSortByMsg,"Products Are Not Sorted In Rates");
    }

    //Tests for Shopping(1)
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeakerTest() throws InterruptedException {

        shoppingTest.mouseHoverOnHotDeals();
        shoppingTest.clickOnSale();
        String expectedSaleMsg = "Sale";//sale assert
        String realSaleMsg = shoppingTest.getSaleMessage();
        Assert.assertEquals(realSaleMsg, expectedSaleMsg);
        shoppingTest.hoverOnSortBy();
        shoppingTest.clickOnNameAToZ();
        Thread.sleep(3000);
        shoppingTest.getClickOnAvengers();
        Thread.sleep(3000);
        String expectedAddedMsg = "Product has been added to your cart";//assert for added cart
        String realAddedMsg = shoppingTest.getProductAddedMessage();
        Assert.assertEquals(realAddedMsg, expectedAddedMsg);
        shoppingTest.getXSign();
        shoppingTest.getYourCartSign();
        shoppingTest.getYourViewCartSign();
        String expectedProductAddedMsg = "Your shopping cart - 1 item";//product added assert
        String realProductAddedMsg = shoppingTest.get1ItemAdded();
        Assert.assertEquals(realProductAddedMsg, expectedProductAddedMsg);
        driver.findElement(By.id("amount16")).clear();//first remove 1 quantity
        Thread.sleep(2000);
        driver.findElement(By.id("amount16")).click(); //click on quantity
        driver.findElement(By.id("amount16")).sendKeys("2");//add 2
        String added2ProductMsg = "Your shopping cart - 2 items";    //assert for 2 quantity added
        String real2ProductMsg = shoppingTest.getting2ItemsAddesMsg();
        Assert.assertEquals(real2ProductMsg, added2ProductMsg);
        String subTotal = "Subtotal: $29.98";  //assert for newly added product
        String realSubTotal = shoppingTest.gettingSubTotal();
        Assert.assertEquals(realSubTotal, subTotal);
        String totalAmount = "$36.00";                     //verify Total
        String realTotalAmount = shoppingTest.gettingTotal();
        Assert.assertEquals(realTotalAmount, totalAmount);
        shoppingTest.gettingGoToCheckOut();
        String expectedLogInMsg = "Log in to your account";                   //login veryfy assert
        String realLogInMsg = shoppingTest.getLoginAcc();
        Assert.assertEquals(realLogInMsg, expectedLogInMsg);
        shoppingTest.getEmail("abf@yahoo.com");
        Thread.sleep(3000);
        shoppingTest.getOnContinue();
        String expectedSecureText = "Secure Checkout";                            //asert for secure checkout
        String realSecureText = shoppingTest.getSecureCheckOut();
        Assert.assertEquals(realSecureText, expectedSecureText);
        shoppingTest.getFirstName("krishna");
        shoppingTest.getLastName("patel");
        shoppingTest.getAddress("123 city Road");
        shoppingTest.getState("Harrow");
        driver.findElement(By.id("shippingaddress-zipcode")).clear();
        sendTextToElement(By.id("shippingaddress-zipcode"), "HA1 2FW");
        Thread.sleep(3000);
        shoppingTest.getClickOnAccLaterUse();
        Thread.sleep(3000);
        shoppingTest.getpassword("12345");
        Thread.sleep(3000);
        shoppingTest.getDeliveryMethod();//delivery
        shoppingTest.getClickOnMethod();//payment method
        Thread.sleep(3000);
        shoppingTest.getClickOnCod();
        String expectedTotal = "$37.03";                  //assert for total
        String realTotal = shoppingTest.getFinalTotal();
        Assert.assertEquals(realTotal, expectedTotal);
        shoppingTest.getMouseHoverToClick();
        shoppingTest.getClickOnFinalButton();
        String expectedLastMsg = "Thank you for your order";    //verifying thank you page
        String realLastMsg = shoppingTest.getThankYouMsg();
        Assert.assertEquals(realLastMsg, expectedLastMsg);
    }
    //2 - verifyThatUserShouldClearShoppingCartSuccessfully(2)
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        shoppingTest.mouseHoverOnHotDeals();
        shoppingTest.getClickOnBestSeller();
        String saleText = "Bestsellers";
        String actualSalesText = shoppingTest.getBestSellerText();
        Assert.assertEquals(actualSalesText,saleText);
        shoppingTest.getMouseHover2();
        shoppingTest.getAtoZ2();
        Thread.sleep(3000);
        shoppingTest.hoverVinzProduct();
        shoppingTest.getVinzProducts();
        String expectedCartMsg = "Product has been added to your cart";   //assert for add to cart
        String actualCartMsg = shoppingTest.getProductAddedMessage2();
        Assert.assertEquals(actualCartMsg,expectedCartMsg);
        shoppingTest.getXSign2();
        shoppingTest.getClickOnYourCart2();
        shoppingTest.getClickOnViewCart2();
        String shopCartMsg = "Your shopping cart - 1 item";
        String realCartMsg = shoppingTest.getProductOneAddedMsg();
        Assert.assertEquals(realCartMsg,shopCartMsg);
        shoppingTest.getEmptyCart2();
        String emptyCartMsg = "Are you sure you want to clear your cart?";
        String realEmptyCartMsg = driver.switchTo().alert().getText();//to get text which we can not inspect
        org.junit.Assert.assertEquals("Cart Is Not Being Emptied", emptyCartMsg, realEmptyCartMsg);
        driver.switchTo().alert().accept();//when ok is also not inspected
        String empryCartMsg = "Item(s) deleted from your cart";            //checking green bar message
        String actualEmptyCartMsgIs =shoppingTest.getDeletesMsg();
        Assert.assertEquals(actualEmptyCartMsgIs,empryCartMsg);
        String lastEmptyCartMessage = "Your cart is empty";    //verifying your cart is empty text
        String actualLastEmptyCartMessage = shoppingTest.getLastMessage();
        Assert.assertEquals(actualLastEmptyCartMessage,lastEmptyCartMessage);




    }
}




