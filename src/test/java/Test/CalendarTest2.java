package Test;

import Pages.Datee;
import org.testng.annotations.Test;

public class CalendarTest2 extends TestBase{
    public CalendarTest2(){
        super("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html\n");
    }
    Datee d ;
    @Test
    public void Setttt(){
        d = new Datee(driver);
        d.selectToSecondChallange("5","Jun","2023");
    }
}
