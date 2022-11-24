package Test;

import Pages.BrokenLinkPage;
import org.testng.annotations.Test;

public class BrokenTest extends TestBase{
    public BrokenTest(){
        super("https://www.amazon.com/");
    }
    BrokenLinkPage l ;
    @Test
    public void FindLinks(){
        l = new BrokenLinkPage(driver);
        l.g("https://www.amazon.com/");
    }
}
