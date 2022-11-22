package Test;

import Pages.OpenTabAndWindowPage;
import org.testng.annotations.Test;

public class OpenTab_Window_print_titels_Test extends TestBase{
    public OpenTab_Window_print_titels_Test(){
        super("https://courses.letskodeit.com/practice");
    }

    OpenTabAndWindowPage f ;

    @Test(priority = 1)
    public void opennewTAbAndPrintTitle(){
        f =new OpenTabAndWindowPage(driver);

        f.OpenTab();
        System.out.println("tab");

    }

    @Test(priority = 2)
    public void opennewWindAndPrintTitle(){
        f =new OpenTabAndWindowPage(driver);

        f.OpenWindow();
        System.out.println("Window");


    }

}
