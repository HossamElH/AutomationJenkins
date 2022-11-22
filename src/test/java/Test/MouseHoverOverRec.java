package Test;

import Pages.RecruitmentTabUsingKeyBoardPage;
import org.testng.annotations.Test;

public class MouseHoverOverRec extends TestBase{
    public MouseHoverOverRec(){
        super("https://opensource-demo.orangehrmlive.com/");
    }
    RecruitmentTabUsingKeyBoardPage rr ;
    @Test
    public void hoverOnRec(){

        rr =  new RecruitmentTabUsingKeyBoardPage(driver);
        rr.Loginsuccessfully("Admin","admin123",driver);
        rr.HoverOnRecrutment(driver);
    }
}
