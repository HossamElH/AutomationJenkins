package Test;

import DataDriven.ReadLoginData;
import Pages.LoginPage;
import org.openqa.selenium.WindowType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class DD_LoginFun extends TestBase{

    public DD_LoginFun()
    {
        super("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    LoginPage Logg ;


    @Test(dataProvider = "DD_LoginSuccessfully")
    public void happyTestCase (String user , String pass)  {
        Logg = new LoginPage(driver);

        Logg.Loginsuccessfully(user, pass);
        if (Logg.AssertThatUserLoginSucc) {
            Logg.SAVECookies(driver, user, pass);

            String strUrl = driver.getCurrentUrl();

            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get(strUrl);


        }
    }
    @DataProvider
    public static Object[][] DD_LoginSuccessfully() throws IOException {
        ReadLoginData obj = new ReadLoginData();
        return obj.sheet() ;

    }


}
