package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class NavigationMenu {

    public NavigationMenu(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(linkText = "map")
    public WebElement map;

    @FindBy(linkText = "schedule")
    public WebElement schedule;

    @FindBy(xpath = "(//*[.='my'])[1]")
    public WebElement scheduleMy;

    @FindBy(xpath = "//*[.='general']")
    public WebElement scheduleGeneral;

    @FindBy(linkText = "hunt")
    public WebElement hunt;

    @FindBy(linkText = "my")
    public WebElement my;

    @FindBy(linkText = "self")
    public WebElement self;

    @FindBy(linkText = "team")
    public WebElement team;

    @FindBy(linkText = "sign out")
    public WebElement signOut;

    public void gotoSelf(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(my).perform();
        self.click();

    }
    public void gotoTeam(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(my).perform();
        team.click();

    }

    public void gotoMySchedule(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(schedule).perform();
        scheduleMy.click();

    }
    public void gotoGeneralSchedule(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(schedule).perform();
        scheduleGeneral.click();

    }


    public void signOut(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(my).perform();
        signOut.click();
    }






}
