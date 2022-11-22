package Test;

import Pages.OpenNewWindowPage;
import org.testng.annotations.Test;

public class OpenNewWindowTest extends TestBase {
    public OpenNewWindowTest(){
        super("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
    }

    OpenNewWindowPage o;
    @Test
    public void openWindowTest(){
        o =new OpenNewWindowPage(driver);
        o.OPenNewWindow();
    }


}
