package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DoubleClickPage extends PageBase{
    public DoubleClickPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "/html/body/div")
    WebElement btn;

    @FindBy(className = "dbl")
    WebElement yellow;
  public  boolean assertthecolor;
    WebDriverWait wait;
    WebElement btnn;
    public void doubleclickonbtn () {
        driver.switchTo().frame(0);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        btnn = wait.until(ExpectedConditions.elementToBeClickable(btn));
        Actions builder = new Actions(driver);
        builder.doubleClick(btnn).perform();
        assertthecolor = yellow.isDisplayed();


    }

}
