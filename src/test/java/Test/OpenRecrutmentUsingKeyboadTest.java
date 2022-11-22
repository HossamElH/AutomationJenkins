package Test;

import DataDriven.ReadLoginData;
import Pages.RecruitmentTabUsingKeyBoardPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class OpenRecrutmentUsingKeyboadTest extends TestBase{

    public OpenRecrutmentUsingKeyboadTest(){
        super("https://opensource-demo.orangehrmlive.com/");
    }

RecruitmentTabUsingKeyBoardPage rr ;

    @Test(dataProvider = "DD_LoginSuccessfully")
    public void Keyboardopenlink (String user , String pass) throws AWTException {
        rr = new RecruitmentTabUsingKeyBoardPage(driver);

        rr.Loginsuccessfully(user, pass, driver);
        if (rr.AssertThatUserLoginSucc) {


            rr.openrecrutment();


        }
    }
    @Test
    public void OpenVacn(){

    }
    @DataProvider
    public static Object[][] DD_LoginSuccessfully() throws IOException {
        ReadLoginData obj = new ReadLoginData();
        return obj.sheet() ;

    }
}
