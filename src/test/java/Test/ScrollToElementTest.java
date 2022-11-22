package Test;

import Pages.OpenTabAndWindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollToElementTest extends TestBase{
    public ScrollToElementTest(){
        super("https://courses.letskodeit.com/practice");

    }

    OpenTabAndWindowPage o ;
    @Test
   public void ScrollToElementt(){

        o = new OpenTabAndWindowPage(driver);
        o.ScrollToSelImag();
        Assert.assertTrue(o.Seltextt);
    }
}
