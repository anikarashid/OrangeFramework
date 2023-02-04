import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.DashBoardPage;
import com.qa.orangehrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class DashBoardPageTest extends TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        driver = driver_init();

        LoginPage loginPage = new LoginPage(driver);
      // loginPage.userName.sendKeys(pro.getProperty("UserName"));
       // loginPage.passWord.sendKeys(pro.getProperty("PassWord"));
   //   loginPage.loginButton.click();
    //  loginPage.doLogin("Admin","admin123");

        loginPage.doLogin(pro.getProperty("UserName"),pro.getProperty("Password"));

    }
    //    TestBase tb = new TestBase();
//    tb.driver_init();

    @Test
    public void test1() throws InterruptedException {
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        Thread.sleep(2000l);
        String actualAccountTag = dashBoardPage.myActionsTag.getText();
        System.out.println(actualAccountTag);
        Assert.assertEquals(actualAccountTag, "My Actions");
    }


    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
