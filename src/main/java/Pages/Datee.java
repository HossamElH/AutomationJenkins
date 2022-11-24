package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Datee extends PageBase {

    public  Datee(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "day")
    WebElement calender;
    @FindBy(id = "datepicker")
    WebElement datapicker;
    @FindBy(className = "ui-datepicker-month")
    WebElement month;
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    WebElement year;

    @FindBy(tagName = "a")
    List<WebElement> listOfDays;
    int counter =0;
    public void setDate(String datttt)
    {

        calender.sendKeys(datttt);
        calender.sendKeys(Keys.TAB);
    }
    public void selectToSecondChallange (String d , String m , String y)
    {
        datapicker.click();

        Select s = new Select(month);
        s.selectByVisibleText(m);
        Select b = new Select(year);
        b.selectByVisibleText(y);

        for(int i= 0 ; i< listOfDays.size();i++)
        {
            if(listOfDays.get(i).getText().equals(d))
            {
                counter = i;

                break;
            }

        }
        listOfDays.get(counter).click();

    }



}
