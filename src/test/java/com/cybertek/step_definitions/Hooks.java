package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.utilities.Driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

@Before
    public void setUp(){

    Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}


@After
    public void tearDown(Scenario scenario){
    if(scenario.isFailed()){
        final byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");

    }

    Driver.closeDriver();
}



    @Before ("@teacher")
    public void teacherSetUp(){


    }

}
