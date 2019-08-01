package com.cybertek.step_definitions.map;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.RoomPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.*;

public class RoomDetailsStepDefinitions {
    @Then("correct room information should be displayed for light side")
    public void correct_room_information_should_be_displayed_for_light_side() {
        String file="./src/test/resources/test_data/light-side-test-data.xlsx";
        String sheet="light-side-rooms";
        ExcelUtil roomData=new ExcelUtil(file,sheet);

        //System.out.println(roomData.rowCount());
        //First part of for each--> Map--> room is each row in the sheet which is roomData.getDataList()

        for(Map<String,String> room:roomData.getDataList()) {

            String roomName = room.get("name");

            MapPage mapPage = new MapPage();
            mapPage.clickRoom(roomName);

            RoomPage roomPage=new RoomPage();
            String capacityExpected=room.get("capacity").replace(".0","");
            String capacityActual=roomPage.capacityQuote.getText().equals("the more the better")?"6":"4";

            String equipmentExpected=room.get("equipment");
            String equipmentActual=roomPage.equipment.getText();


            BrowserUtils.waitPlease(2);

            Assert.assertEquals(capacityExpected,capacityActual);
            Assert.assertEquals(equipmentExpected,equipmentActual);
            Driver.getDriver().navigate().back();


        }


    }

}
