package Test;

import Pages.BrokenLinkPage;
import org.testng.annotations.Test;

public class Broken_Links_Master_Test extends TestBase{
    public Broken_Links_Master_Test(){
        super("https://www.amazon.com/");
    }
    BrokenLinkPage l ;
    @Test
    public void FindLinks(){
        l = new BrokenLinkPage(driver);
        l.g("https://www.amazon.com/");
    }



}
