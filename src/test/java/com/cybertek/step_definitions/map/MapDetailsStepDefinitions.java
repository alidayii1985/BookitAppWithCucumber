package com.cybertek.step_definitions.map;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.MyTeamPage;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MapDetailsStepDefinitions {

    @Then("I should be able to see {string} room")
    public void i_should_be_able_to_see_room(String roomName) {
       MapPage mapPage=new MapPage();

        /////////Alternative 1
        //We can find element by a general finder method from mapPage
        //Assert.assertTrue(mapPage.roomLabelElement(roomName).isDisplayed());


        /////////Alternative 2
        //Or We can find all room elements by a general locator from mapPage as a List
        // then check the String list for specific room name (for String List we can use getElementsText from Utils
        //First part of Assert can be useful for fails. We can see the message if we cannot find the room
        Assert.assertTrue(roomName+" was not found",BrowserUtils.getElementsText(mapPage.allRooms).contains(roomName));
    }



    @Then("user should be able to see following conference rooms:")
    public void user_should_be_able_to_see_following_conference_rooms(List<String>rooms) {




    }

    @When("the user goes to the {string} page")
    public void the_user_goes_to_the_page(String page) {
        MapPage mapPage=new MapPage();
        switch (page){
            case "map":
                mapPage.map.click();
                break;
            case "hunt":
                mapPage.hunt.click();
                break;

            case "my self":
                mapPage.gotoSelf();
                break;

            case "my team":
                mapPage.gotoTeam();
                break;

            default:
                System.out.println("No tab name or sub tab name as you entered");
                break;




        }

    }

    @Then("following team members should be displayed:")
    public void following_team_members_should_be_displayed(List<String>members) {
        MyTeamPage myTeamPage=new MyTeamPage();
        List<String>actualMembers= BrowserUtils.getElementsText(myTeamPage.allNames);

        Assert.assertEquals(members.size(),actualMembers.size());
        Assert.assertTrue(members.containsAll(actualMembers));




    }





}
