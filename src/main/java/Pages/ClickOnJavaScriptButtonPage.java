package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickOnJavaScriptButtonPage extends PageBase {
    public  ClickOnJavaScriptButtonPage(WebDriver driver){
        super(driver);
    }
@FindBy(xpath = "//*[@id=\"zen_cs_desc_with_promo_dynamic\"]/div/div/div[1]/h1")
WebElement goOnTheCourse;
    @FindBy(xpath = "//*[@id=\"course-list\"]/div[1]/div/a/div[1]/div[1]/img")
    WebElement javabtn;
    public boolean AssertThatClickedSucc;

    public void clickOnBtn(){
        driver.switchTo().frame("iframe-name");
        javabtn.click();
        AssertThatClickedSucc = goOnTheCourse.isDisplayed();


    }

}
