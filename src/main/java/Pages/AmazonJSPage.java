package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonJSPage extends PageBase{
    public AmazonJSPage(WebDriver driver)
    {
        super(driver);
    }
@FindBy(id = "nav-link-accountList")
    WebElement SignInElement;
    @FindBy(id = "nav-al-container")
    WebElement Diallog;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")
    WebElement accPage;

    @FindBy(xpath = "//*[@id=\"nav-al-your-account\"]/a[1]")
    WebElement Acc;

   public Boolean Asserrrttrue = false;
    public void JSHover()  {

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].mouseOver();",SignInElement);
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";

        ((JavascriptExecutor) driver).executeScript(mouseOverScript,SignInElement);
            Asserrrttrue = Diallog.isDisplayed();
       // ((JavascriptExecutor)driver).executeScript("arguments[0].click();",SignInElement);


//

    }
    public void clickonacc(){
//        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//
//        ((JavascriptExecutor) driver).executeScript(mouseOverScript,SignInElement);
//        Asserrrttrue = Diallog.isDisplayed();
         ((JavascriptExecutor)driver).executeScript("arguments[0].click();",Acc);
        Asserrrttrue = accPage.isDisplayed();
    }


}
//    WebElement element = driver.findElement(By.xpath(Locator));
