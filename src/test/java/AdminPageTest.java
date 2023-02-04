import com.qa.orangehrm.base.TestBase;
import com.qa.orangehrm.pages.DashBoardPage;
import com.qa.orangehrm.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AdminPageTest extends TestBase {

  @BeforeMethod
  public void setUp() throws IOException {

      driver=driver_init();
      LoginPage loginPage =new LoginPage(driver);
     loginPage.doLogin(pro.getProperty("UserName"), pro.getProperty("Password"));
      DashBoardPage dashBoardPage = new DashBoardPage(driver);
      dashBoardPage.adminbutton.click();
  }

@Test
    public void Test(){

}

}
