package Test;

import Pages.Datee;
import org.testng.annotations.Test;

public class CalendarTest1 extends TestBase{
    public CalendarTest1(){
        super("https://trytestingthis.netlify.app/");
    }
    Datee d ;
    @Test
    public void Sett(){
        d = new Datee(driver);
        d.setDate("10262023");
    }
}
