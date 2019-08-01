package com.cybertek.step_definitions.hunt;

import com.cybertek.pages.HuntPage;
import com.cybertek.pages.MapPage;
import com.cybertek.pages.MySchedulePage;
import com.cybertek.pages.SigninPage;
import com.cybertek.utilities.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class UserRolesStepDefinitions {


    @Given("the user logs in as a light-side <user>")
    public void theUserLogsInAsALightSideUser() {


    }


    @And("there are available spots for scheduling")
    public void thereAreAvailableSpotsForScheduling() {
        MySchedulePage mySchedulePage=new MySchedulePage();
        mySchedulePage.gotoMySchedule();
        BrowserUtils.waitPlease(2);
        // check 7:00am for tomorrow

        System.out.println(mySchedulePage.isCellBlockAvailable("7:00am",1));

    }

    @When("the user hunts for a spot")
    public void theUserHuntsForASpot() {
        HuntPage huntPage=new HuntPage();
        huntPage.hunt.click();
        huntPage.date.sendKeys(DateUtil.todaysDate());
        BrowserUtils.waitPlease(2);
        huntPage.selectFrom("8:00am");
        BrowserUtils.waitPlease(2);
        huntPage.selectTo("9:00am");
        huntPage.searchButton.click();


    }



    @Given("the user logs in as a light-side team member")
    public void theUserLogsInAsALightSideTeamMember() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        SigninPage signinPage=new SigninPage();
        signinPage.login(UserUtility.getUserCredentials(ApplicationConstants.STUDENT_TEAM_MEMBER,ApplicationConstants.LIGHT_SIDE).get(ApplicationConstants.COLUMN_EMAIL),
                         UserUtility.getUserCredentials(ApplicationConstants.STUDENT_TEAM_MEMBER,ApplicationConstants.LIGHT_SIDE).get(ApplicationConstants.COLUMN_PASSWORD)   );
//        MapPage mapPage=new MapPage();
//        mapPage.signOut();


    }

    @Given("the user logs in as a light-side team leader")
    public void theUserLogsInAsALightSideTeamLead() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        SigninPage signinPage=new SigninPage();
        signinPage.login(UserUtility.getUserCredentials(ApplicationConstants.STUDENT_TEAM_LEADER,ApplicationConstants.LIGHT_SIDE).get(ApplicationConstants.COLUMN_EMAIL),
                         UserUtility.getUserCredentials(ApplicationConstants.STUDENT_TEAM_LEADER,ApplicationConstants.LIGHT_SIDE).get(ApplicationConstants.COLUMN_PASSWORD)   );
//        MapPage mapPage=new MapPage();
//        mapPage.signOut();


    }

    @Given("the user logs in as a light-side teacher")
    public void theUserLogsInAsALightSideTeacher() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        SigninPage signinPage=new SigninPage();
        signinPage.login(UserUtility.getUserCredentials(ApplicationConstants.TEACHER,ApplicationConstants.LIGHT_SIDE).get(ApplicationConstants.COLUMN_EMAIL),
                         UserUtility.getUserCredentials(ApplicationConstants.TEACHER,ApplicationConstants.LIGHT_SIDE).get(ApplicationConstants.COLUMN_PASSWORD)   );
//        MapPage mapPage=new MapPage();
//        mapPage.signOut();

    }
    @Then("book button should not be displayed")
    public void book_button_should_not_be_displayed() {
        BrowserUtils.verifyElementNotDisplayed(By.tagName("button"));
    }

    @Then("book button should be displayed")
    public void book_button_should_be_displayed() {
        BrowserUtils.verifyElementDisplayed(By.tagName("button"));
}




}



