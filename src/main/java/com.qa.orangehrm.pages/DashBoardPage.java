package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
    private WebDriver driver;

    @FindBy(xpath = "//p[text()='RAJ Desai']")////p[text()='Paul Collings']
    public WebElement successLoginMsg;
    @FindBy(xpath = "//p[text()='My Actions']")
    public WebElement myActionsTag;
    @FindBy(xpath = "//span[text()='Admin']")
    public WebElement adminbutton;



    public DashBoardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
