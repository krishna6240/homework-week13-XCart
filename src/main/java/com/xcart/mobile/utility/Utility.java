package com.xcart.mobile.utility;

import com.xcart.mobile.drivermanager.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Utility extends DriverManager {

          /*
           this method will click on element
           @param by
            */
        public void clickOnElement(By by) {
            WebElement loginLink = driver.findElement(by);
            loginLink.click();

        }
        /*
        this method will get text fram element
        @pram by
        @return
         */
        public String getTextElement(By by) {
            return driver.findElement(by).getText();
       /* WebElement message = driver.findElement(by);
        String actualMessage = message.getText();
        return  actualMessage;*/
        }
    /*
    this method will send text on element
    @pram by
    @param text
     */

        public void sendTextToElement(By by, String text) {
            driver.findElement(by).sendKeys(text);
        }

        public void acceptAltert() {
            clickOnElement(By.name("proceed"));//click on sign in button
            Alert alter = driver.switchTo().alert();//creating alter object reference and switch to alter
            System.out.println(alter.getText());
            // alter.sendKeys("krishna");
            alter.accept();//accepting alter
        }

        public void dismissAltert() {
            clickOnElement(By.name("proceed"));//click on sign in button
            Alert alter = driver.switchTo().alert();//creating alter object reference and switch to alter
            System.out.println(alter.getText());
            // alter.sendKeys("krishna");
            alter.dismiss();

        }
        public String alertgetText(By by) {
            clickOnElement(By.name("proceed"));//click on sign in button
            String alter = driver.switchTo().alert().getText();
            System.out.println(alter);
            return getTextElement(by);

        }
        public static void selectValueFromdropDown(By by, String value) {
            Select select = new Select(driver.findElement(by));
            select.selectByValue(value);
        }

        public void selectVisibleTextFromDropDown(By by, String visibletext) {
            //WebElement dropdown = driver.findElement(by);
            Select select = new Select(driver.findElement(by));
            select.selectByVisibleText(visibletext);

        }

        public void selectByIndexFromDropDown(By by, int index) {
            Select select = new Select(driver.findElement(by));
            select.deselectByIndex(index);
        }

        public void clearValue(By by) {
            driver.findElement(by).clear();
        }
        public WebElement mouseHover(By by) {
            Actions actions = new Actions(driver);
            WebElement move = driver.findElement(by);
            actions.moveToElement(move).perform();
            return move;
        }
        public void verifyPage(String expectedResult,By by) {
            WebElement compare = driver.findElement(by);
            String actualResult = compare.getText();
            //  Assert.assertEquals(expectedResult, actualResult);

        }


        public void mouseHoverToElement(By by) {
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(by)).perform();
        }
        public void mouseHoverToClickElement(By by){
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(by)).click().build().perform();
        }
        public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }


        public void selectlistbyElement(By by,int text){
            WebElement dropdown = driver.findElement(By.name(""));
            Select select = new Select(dropdown);
            List<WebElement> alloptions = select.getOptions();
            System.out.println(alloptions.size());
            for (WebElement option:alloptions){
                System.out.println(option.getText());
                if(option.getText().equalsIgnoreCase("")){
                    option.click();
                }
            }
        }
    }





