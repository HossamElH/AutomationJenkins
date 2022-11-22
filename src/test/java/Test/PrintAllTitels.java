package Test;

import Pages.OpenNewWindowPage;
import org.testng.annotations.Test;

public class PrintAllTitels extends TestBase {
    public PrintAllTitels(){
        super("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
    }

    OpenNewWindowPage o;
    @Test
    public void openWindowTest(){
        o =new OpenNewWindowPage(driver);
        o.OPenNewWindow();
//        System.out.println("hello");
        System.out.println(o.alltitels);
    }


}


