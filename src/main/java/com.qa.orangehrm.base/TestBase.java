package com.qa.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

public WebDriver driver;
public Properties pro;
public  FileInputStream fil;

    public void driver_init() throws IOException {
      //  Properties pro = new Properties();
        pro =new Properties();
        fil =new FileInputStream("C:\\Users\\M A Masud\\IdeaProjects\\OctobarSation22Framework\\src\\main\\java\\com\\qa\\orangehrm\\config\\config.properties");
     //   FileInputStream fil= new FileInputStream("Users\\M A Masud\\IdeaProjects\\OctoberStation22Framework\\src\\main\\java\\com\\qa\\orangehrm\\config\\config.properties");
        pro.load(fil);
   // pro.getProperty("Url");
  //  pro.getProperty("BrowserName");

        String browser_Name = "chrome";

    if(browser_Name.equalsIgnoreCase("Chrome")){
      //  WebDriver driver = new ChromeDriver();
       driver = new ChromeDriver();
    } else if (browser_Name.equalsIgnoreCase("firefox")) {
      // WebDriver driver = new FirefoxDriver();
      driver = new FirefoxDriver();
    } else if (browser_Name.equalsIgnoreCase("Safari")) {
      //  WebDriver driver = new SafariDriver();
       driver = new SafariDriver();
    } else if (browser_Name.equalsIgnoreCase("Edge")) {
     // WebDriver driver = new EdgeDriver();
        driver = new EdgeDriver();
    }else {
        System.out.println("please provide current browser name");
    }
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
   // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.get(pro.getProperty("Url"));

    }

    public static void main(String[] args) throws IOException {
        TestBase base = new TestBase();
        base.driver_init();
    }


}
