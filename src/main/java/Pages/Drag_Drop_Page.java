package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Drag_Drop_Page extends PageBase{
    public Drag_Drop_Page(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "draggable")
    WebElement src;

    @FindBy(id = "droppable")
    WebElement target;

    public void dragDrop(){
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(src,target).build().perform();
       Assert.assertEquals("Dropped!",target.getText());
    }

}
