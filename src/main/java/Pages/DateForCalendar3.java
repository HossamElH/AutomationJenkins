package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class DateForCalendar3 extends PageBase {
    public DateForCalendar3(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "//*[@id=\"datepicker\"]/span")
    WebElement CalenderBtn;

    @FindBy(xpath = "/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")
    WebElement val;

    //    @FindBy(xpath = "/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")
//    WebElement next;
//
//
//    @FindBy(xpath = "/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]")
//    WebElement pre;
    @FindBy(xpath = "/html/body/div[2]/div[2]/table/thead/tr/th[1]")
    static WebElement pre;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/thead/tr/th[3]")
    static WebElement next;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/thead/tr/th[2]")
    WebElement t;

    List<WebElement> mon;
    List<WebElement> dd;


    public void Test3(String day, String month, String year) {

        CalenderBtn.click();
        val.click();
        String Da;


//        System.out.println(Da);

        int yearr = Integer.parseInt(year);
        Da = t.getText();
        int CurrentYear = Integer.parseInt(Da);

//        System.out.println(theDiff);

        while (!Da.equals(year))
        {
            Da = t.getText();
            int theDiff = yearr - CurrentYear;
            if (theDiff != 0) {
                if (theDiff > 0) {

                    for (int i = 0; i < theDiff; i++) {
                        next.click();
                        System.out.println("next");
                    }
                } else if (theDiff < 0) {
                    theDiff *= -1;

                    for (int i = 0; i < theDiff; i++) {
                        pre.click();
                        System.out.println(" prevv ");
                    }
                }
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                Da = t.getText();
                System.out.println(Da);
                CurrentYear = Integer.parseInt(Da);

                if (CurrentYear == yearr) {
                    System.out.println(" = ");
                    mon = driver.findElements(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span"));
                    System.out.println(mon.size());
                    for (int i = 0; i < mon.size(); i++) {
                        System.out.println(mon.get(i).getText());
                        if (mon.get(i).getText().equals(month)) {
                            System.out.println(mon.get(i).getText());
                            mon.get(i).click();
                            break;
                        }
                    }
                    dd = driver.findElements(By.xpath("//td[@class='day']"));
                    System.out.println(dd.size());

                    for (int i = 0; i < dd.size(); i++) {
                        if (dd.get(i).getText().equals(day)) {
                            dd.get(i).click();
                            break;
                        }
                    }

                }
            }

            //  yy = driver.findElements(By.xpath("/html/body/div[2]/div[3]"));


//
//        for (int i = 0; i < yy.size(); i++) {
//            if (yy.get(i).getText().equalsIgnoreCase(year))
//                yy.get(i).click();
//        }


        }
    }
}
