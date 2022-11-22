package Test;

import Pages.RecruitmentTabUsingKeyBoardPage;
import org.testng.annotations.Test;

public class OpenVacanciesTest extends TestBase{
    public OpenVacanciesTest(){
        super("https://opensource-demo.orangehrmlive.com/");
    }
    RecruitmentTabUsingKeyBoardPage rr ;

    @Test
    public void openVac() {
        rr = new RecruitmentTabUsingKeyBoardPage(driver);
        rr.Loginsuccessfully("Admin","admin123",driver);
        rr.openVacancies();
//        if(rr.AssertThatUserLoginSucc)
//        {
//
//
//        }
    }

}
