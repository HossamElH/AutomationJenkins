package Test;

import Pages.AmazonJSPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonClickOnAccJSTest extends TestBase{
    public AmazonClickOnAccJSTest(String url) {
        super("https://www.amazon.com/");
    }

    public void AmazonMouseHoverJSTest(){

    }

    AmazonJSPage Obj ;

    @Test
    public void ClickOnAcc(){

        Obj = new AmazonJSPage(driver);
        Obj.clickonacc();
       Assert.assertTrue(Obj.Asserrrttrue);
    }
}
