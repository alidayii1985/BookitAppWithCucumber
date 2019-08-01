package com.cybertek.step_definitions.account;


import com.cybertek.pages.MapPage;
import com.cybertek.pages.MySelfPage;
import com.cybertek.pages.RoomPage;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MyDetailsStepDefinitions {
    @Then("user should see his information:")
    public void user_should_see_his_information(Map<String ,String > userInfo) {

        BrowserUtils.waitPlease(5);
        MySelfPage mySelfPage=new MySelfPage();

        List<String> expectedInfo=new ArrayList<>(Arrays.asList(userInfo.get("name"),userInfo.get("role"),userInfo.get("team"),
                                                                userInfo.get("batch"),userInfo.get("campus")));

        List<String>actualInfo=new ArrayList<>(Arrays.asList(mySelfPage.name.getText(),mySelfPage.role.getText(),mySelfPage.team.getText(),
                                                            mySelfPage.batch.getText(),mySelfPage.campus.getText()));

        Assert.assertEquals(expectedInfo,actualInfo);




    }


    @Then("user should be able to see quotes info for each room")
    public void user_should_be_able_to_see_quotes_info_for_each_room(Map<String ,String>rooms) {
        MapPage mapPage=new MapPage();
        RoomPage roomPage=new RoomPage();
        for(String room:rooms.keySet()){
            mapPage.clickRoom(room);
            Assert.assertEquals(rooms.get(room),roomPage.capacityQuote.getText());
            roomPage.map.click();



        }


         }



}
