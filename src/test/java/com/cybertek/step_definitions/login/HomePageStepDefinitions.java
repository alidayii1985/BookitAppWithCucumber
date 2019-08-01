package com.cybertek.step_definitions.login;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.SigninPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {

    @Given("user on the login page")
    public void     userOnTheLoginPage() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user logs in as a team lead")
    public void userLogsInAsATeamLead() {



        SigninPage signinPage=new SigninPage();
        signinPage.login(ConfigurationReader.getProperty("leader_email"),
                         ConfigurationReader.getProperty("leader_password"));

    }

    @Then("homepage should be displayed")
    public void homepageShouldBeDisplayed() {

        String expected="map";

        MapPage mapPage=new MapPage();
        BrowserUtils.waitForVisibility(mapPage.mapOfRooms,10);
        String actual= mapPage.header.getText();
        Assert.assertEquals(expected,actual);


    }


    @And("the title should be correct")
    public void theTitleShouldBeCorrect() {
    }

    @When("user logs in as a team member")
    public void userLogsInAsATeamMember() {

        SigninPage signinPage=new SigninPage();
        signinPage.login(ConfigurationReader.getProperty("member_email"),
                ConfigurationReader.getProperty("member_password"));



    }

    @When("user logs in as a teacher")
    public void userLogsInAsATeacher() {
        SigninPage signinPage=new SigninPage();
        signinPage.login(ConfigurationReader.getProperty("teacher_email"),
                ConfigurationReader.getProperty("teacher_password"));


    }

//    @When("user logs in as a {string}")
//    public void user_logs_in_as_a(String type) {
//        SigninPage signinPage=new SigninPage();
//        signinPage.login(ConfigurationReader.getProperty(type+"_email"),
//                ConfigurationReader.getProperty(type+"_password"));
//    }




}
