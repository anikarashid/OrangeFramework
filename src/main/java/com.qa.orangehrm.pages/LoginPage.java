package com.qa.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebElement loginBtn;


    //page factory model
//a[@name ="username"]
//input[@name ='username']
//input[contains(@name,'password')],,////input[@type='password'],,////input[@name='password']
//button[contains(@class,'oxd-button oxd')],//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']
//p[text()='Forgot your password? ']
// div[@class='orangehrm-login-branding']
 //h5[text()='Login']
//driver.findelement.by.xpath

    private WebDriver driver;
    @FindBy(xpath = "//input[@name ='username']")
    public WebElement userName;//PageFactorymethod.
    @FindBy(xpath = "//input[contains(@name,'password')]")
    public WebElement passWord;
    @FindBy(xpath = "//button[contains(@class,'oxd-button oxd')]")
    public WebElement loginButton;
    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    public WebElement forgotPassWordLink;
    @FindBy(xpath = "//div[@class='orangehrm-login-branding']")
    public WebElement OrangeHRM;
    @FindBy(xpath = "//h5[text()='Login']")
    public WebElement LoginLink;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public DashBoardPage doLogin(String uName, String pwd ){
        userName.clear();
        userName.sendKeys(uName);
        passWord.clear();
        passWord.sendKeys(pwd);
        loginButton.click();
        return new DashBoardPage(driver);

    }





}