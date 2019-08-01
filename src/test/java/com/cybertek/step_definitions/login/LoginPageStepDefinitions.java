package com.cybertek.step_definitions.login;


import com.cybertek.pages.MapPage;
import com.cybertek.pages.SigninPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefinitions {
    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        // Write code here that turns the phrase above into concrete actions
        SigninPage signinPage=new SigninPage();
        signinPage.login(email,password);

    }

    @Then("title should be {string}")
    public void title_should_be(String title) {
        // Write code here that turns the phrase above into concrete actions
         }



    @Then("location should be {string}")
    public void location_should_be(String expectedLocation) {
        MapPage mapPage=new MapPage();
        String actualLocation=mapPage.location.getText();
        Assert.assertEquals(expectedLocation,actualLocation);
    }

    @When("there should be {int} menu options")
    public void there_should_be_menu_options(Integer count) {
        // Write code here that turns the phrase above into concrete actions
        }






}


