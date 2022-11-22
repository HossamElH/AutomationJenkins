package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class OpenTabAndWindowPage extends PageBase{
    public  OpenTabAndWindowPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id = "opentab")
    WebElement OpenTab;
    @FindBy(id = "openwindow")
    WebElement OpenWindow;
    @FindBy(id = "displayed-text")
    WebElement TextField;
    @FindBy(id = "hide-textbox")
    WebElement HideBtn;
    @FindBy(id = "show-textbox")
    WebElement ShowBtn;
    @FindBy(xpath = "//*[@id=\"course-list\"]/div[4]/div/a")
    WebElement SlenImage;
@FindBy(xpath = "//*[@id=\"course-list\"]/div[4]/div/a/div[1]/div[1]/img")
        WebElement SelText;

    String current = driver.getWindowHandle();
     String Titletab;
    String titleofWindow;
    public boolean AssertHide = false;
    public boolean AssertShow = true;
    public boolean  Seltextt = false;
    public void OpenTab(){
        OpenTab.click();
        ArrayList<String> handels = new ArrayList<>(driver.getWindowHandles());
        for(String actual : handels) {
            if (!actual.equalsIgnoreCase(current)) {
                driver.switchTo().window(actual);
                Titletab = driver.getTitle();
                System.out.println(Titletab);

                break;

            }

        }
        driver.close();
        driver.switchTo().window(current);
        System.out.println(handels.size());

    }
    public void OpenWindow(){
        OpenWindow.click();
        ArrayList<String> handels = new ArrayList<>(driver.getWindowHandles());
        for(String actual : handels) {
            if (!actual.equalsIgnoreCase(current)) {
                driver.switchTo().window(actual);
                titleofWindow = driver.getTitle();
                System.out.println(titleofWindow);

                break;

            }

        }

        System.out.println(handels.size());

    }

    public void hide_show()  {
        HideBtn.click();
        AssertHide = TextField.isDisplayed();
        ShowBtn.click();
        AssertShow = TextField.isDisplayed();

    }
    public void  ScrollToSelImag()
    {
        driver.switchTo().frame("courses-iframe");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", SlenImage);
        Seltextt = SelText.isDisplayed();

    }

}
