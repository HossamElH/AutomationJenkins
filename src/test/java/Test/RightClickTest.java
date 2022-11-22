package Test;

import Pages.RightClickPage;
import org.testng.annotations.Test;

public class RightClickTest extends TestBase{
public RightClickTest(){
    super("https://demo.guru99.com/test/simple_context_menu.html");
}
RightClickPage r;
@Test
    public void TestRightClick()  {
    r  = new RightClickPage(driver);
    r.RightClick();
}
}
