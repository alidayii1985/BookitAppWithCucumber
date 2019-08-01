package com.cybertek.utilities;




import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.NoSuchElementException;

public class BrowserUtils {

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void waitPlease(int seconds){
        try {
            Thread.sleep(seconds * 1000 );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    /**
     * return a list of string from a list of elements
     * text
     *
     * @param list of webelements
     * @return
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }



    public static void verifyElementDisplayed(By by){

        try {
            Assert.assertTrue("Element not visible: "+by,Driver.getDriver().findElement(by).isDisplayed());
        }catch (NoSuchElementException e){
            Assert.fail("Element not found: "+by);
        }
    }


    public static void verifyElementNotDisplayed(By by){

        try {
            Assert.assertFalse("Element should not be visible: "+by,Driver.getDriver().findElement(by).isDisplayed());
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public static void clickWithTimeOut(WebElement element, int timeout){
        for(int i=0;i<timeout;i++){
           try {
               element.click();
               return;
           }catch (WebDriverException e){
               waitPlease(1);
           }
        }

    }




}
