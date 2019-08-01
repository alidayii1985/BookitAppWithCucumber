package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Utilities;

public class SigninPage {


    public SigninPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "email")
    public WebElement username;


    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "[type=submit]")
    public WebElement signinButton;

    public void login(String email,String password){
        this.username.sendKeys(email);
        this.password.sendKeys(password);
        this.signinButton.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.urlContains("map"));
        BrowserUtils.waitPlease(2);


    }

}
