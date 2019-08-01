package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HuntPage extends NavigationMenu {


    @FindBy(id = "mat-input-0")
    public WebElement date;

    @FindBy(id = "mat-select-0")
    public WebElement from;


    @FindBy(xpath= "(//mat-option/span)[1]")
    public WebElement fromTimes;

    @FindBy(id = "mat-select-1")
    public WebElement to;

    @FindBy(xpath = "(//mat-option/span)[2]")
    public WebElement toTimes;

    @FindBy(linkText = "search")
    public WebElement searchButton;





public void selectFrom(String startTime){
    from.click();
    String xpath="//span[contains(.,'"+startTime+"')]";
    Driver.getDriver().findElement(By.xpath(xpath)).click();

}

    public void selectTo(String endTime){
        to.click();
        String xpath="//span[contains(.,'"+endTime+"')]";
        Driver.getDriver().findElement(By.xpath(xpath)).click();

    }

}
