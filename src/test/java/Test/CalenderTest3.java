package Test;

import Pages.DateForCalendar3;
import org.testng.annotations.Test;

public class CalenderTest3 extends TestBase{
public CalenderTest3(){
    super("https://webdriveruniversity.com/Datepicker/index.html");
}
DateForCalendar3 l ;
@Test(priority = 1)
    public void sett() throws InterruptedException {
    l =new DateForCalendar3(driver);
    l.Test3("20","Dec","2020");

}
    @Test(priority = 2)
    public void set2() throws InterruptedException {
        l =new DateForCalendar3(driver);

        l.Test3("19","Dec", "2023");
    }


}
