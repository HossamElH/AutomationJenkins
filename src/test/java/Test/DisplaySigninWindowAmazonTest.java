package Test;

import Pages.AmazonJSPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplaySigninWindowAmazonTest extends TestBase {
    public DisplaySigninWindowAmazonTest() {
        super("https://www.amazon.com/");
    }



    AmazonJSPage Obj;

    @Test
    public void ClickOnAcc() {

        Obj = new AmazonJSPage(driver);
        Obj.JSHover();
        Assert.assertTrue(Obj.Asserrrttrue);
    }
}