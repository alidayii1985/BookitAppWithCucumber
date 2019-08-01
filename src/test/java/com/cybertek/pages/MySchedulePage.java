package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MySchedulePage extends NavigationMenu {

    /**
     * start addDays with 0. 0 means today. until 6 days from today
     *
     * @param startTime
     * @param addDays
     * @return cell block based on time and day from the chart
     */
    public WebElement getCell(String startTime, int addDays){
    String xpath="//*[contains(text(),'"+startTime+"')]/../../td["+(addDays+1)+"]";

    return Driver.getDriver().findElement(By.xpath(xpath));
}

    /**
     *
     * @param  //addDays with 0. 0 means today. until 6 days from today
     * @return all cells from this specific day will be returned as List
     */

public List<WebElement>getCellsForDay(int addDay){

        String xpath="//tbody//tr["+(addDay+1)+"]//td";
        return Driver.getDriver().findElements(By.xpath(xpath));
}

public boolean isCellBlockAvailable(String startTime, int addDays){

    return !getCell(startTime,addDays).getAttribute("class").contains("conference");

}

public boolean isDayAvailable(int addDays){
    for (WebElement cell:getCellsForDay(addDays)){
        if (cell.getAttribute("class").contains("conference")) return false;
    }
    return true;

}
}
