package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RightClickPage extends PageBase{
    public RightClickPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"authentication\"]/span")
    WebElement btn;

    public void RightClick ()  {


        Actions builder = new Actions(driver);
        builder.contextClick(btn).perform();



    }

}
