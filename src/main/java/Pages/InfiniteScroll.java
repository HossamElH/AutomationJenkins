package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfiniteScroll extends PageBase{
    public InfiniteScroll(WebDriver  driver){
        super(driver);
    }
    @FindBy (id = "page-footer")
    WebElement Footer;

    public WebElement getFooter(){
        return Footer;
    }
}
