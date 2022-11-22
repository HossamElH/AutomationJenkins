package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage extends  PageBase{
    public UploadFilePage(WebDriver driver){
        super(driver);
    }
@FindBy(id = "file-upload")
    WebElement uploadd;
    @FindBy(xpath = "  //*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div[2]")
    WebElement message;

String image ="1.jpg";
String Filepathh = System.getProperty("user.dir")+"/Upload/"+image;
    public void uploaad(){
        uploadd.sendKeys(Filepathh);
        Assert.assertTrue(message.isDisplayed());

    }
}
