package Test;

import Pages.OpenTabAndWindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HidenAndShowTest extends TestBase{
    public  HidenAndShowTest(){
        super("https://courses.letskodeit.com/practice");
    }

    OpenTabAndWindowPage Obj ;

    @Test
    public void HideShowTests()  {
        Obj = new OpenTabAndWindowPage(driver);
        Obj.hide_show();
        Assert.assertTrue(Obj.AssertShow);
        Assert.assertFalse(Obj.AssertHide);
    }


}
