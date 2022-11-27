package Test;

import DataDriven.ReadLoginData;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class DD_LoginFun extends TestBase{

    public DD_LoginFun()
    {
        super("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    LoginPage Logg ;



//    @Test(dataProvider = "DD_LoginSuccessfully",priority = 1)
//    public void happyTestCase (String user , String pass)  {
//        Logg = new LoginPage(driver);
//
//        Logg.Loginsuccessfully(user, pass);
//      Assert.assertTrue(Logg.AssertThatUserLoginSucc);
//    }
    @Test(dataProvider = "Invaliddd")
    public void NegativeOne (String user , String pass)  {
        Logg = new LoginPage(driver);
        Logg.CantLoginsuccessfully(user, pass);
        Assert.assertTrue(Logg.AssertThatUserLoginSucc);
    }
    @DataProvider
    public static Object[][] DD_LoginSuccessfully() throws IOException {
        ReadLoginData obj = new ReadLoginData();
        return obj.sheet() ;

    }
    @DataProvider
    public static Object[][] Invaliddd() throws IOException {
        ReadLoginData obj = new ReadLoginData();
        return obj.sheett() ;

    }


}
