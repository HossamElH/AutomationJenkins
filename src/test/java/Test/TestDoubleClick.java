package Test;

import Pages.DoubleClickPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDoubleClick extends TestBase {
    public TestDoubleClick(){
        super("https://api.jquery.com/dblclick/");
    }
    DoubleClickPage cc;
    @Test
    public void testdoubleclicks() {
        cc = new DoubleClickPage(driver);
        cc.doubleclickonbtn();
        Assert.assertTrue(cc.assertthecolor);
    }
}
