package Test;

import Pages.ClickOnJavaScriptButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickOnJavaScriptButtonTest extends TestBase {
    public ClickOnJavaScriptButtonTest(){
        super("https://courses.letskodeit.com/practice");

    }
    ClickOnJavaScriptButtonPage javapage;


    @Test
    public void TestJavaBtn(){
        javapage = new ClickOnJavaScriptButtonPage(driver);

        javapage.clickOnBtn();
        Assert.assertTrue(javapage.AssertThatClickedSucc);
    }
}
