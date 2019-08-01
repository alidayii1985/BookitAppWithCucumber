package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MapPage extends NavigationMenu{


    @FindBy(tagName = "h1")
    public WebElement header;

    @FindBy(className = "map")
    public WebElement mapOfRooms;

    @FindBy(css = "[class=subtitle]")
    public WebElement location;


    @FindBy(css = "a>span.room-name")
    public List<WebElement> allRooms;


    public void clickRoom(String roomName) {
        Driver.getDriver().findElement(By.xpath("//span[.='" + roomName + "']")).click();
        BrowserUtils.waitPlease(2);
    }
//
//    }
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    public void clickToTab(String tabName){
//        Driver.getDriver().findElement(By.xpath("//a[.='"+tabName+"']")).click();
//
//    }
//    public void clickToSubTab(String tabName,String subTabName){
//        Driver.getDriver().findElement(By.xpath("//*[@class='navbar-link'][.='"+tabName+"']")).click();
//        Driver.getDriver().findElement(By.xpath("//*[@class='navbar-item'][.='"+subTabName+"']")).click();
//
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
