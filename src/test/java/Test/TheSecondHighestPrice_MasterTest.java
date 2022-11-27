package Test;

import Pages.TheSecondHighestPrice_PAge;
import org.testng.annotations.Test;

public class TheSecondHighestPrice_MasterTest extends TestBase{
public TheSecondHighestPrice_MasterTest(){
    super("https://www.saucedemo.com/");
}
    TheSecondHighestPrice_PAge l ;
    @Test
    public void TestPrice(){
        l = new TheSecondHighestPrice_PAge(driver);
        l.FindThePrice("standard_user","secret_sauce");

    }
}
