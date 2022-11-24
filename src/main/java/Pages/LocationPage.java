package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationPage extends PageBase{

public LocationPage(WebDriver driver){
    super(driver);
}

@FindBy(id = "español")
    WebElement span;

@FindBy(id = "//*[@id=\"nav-flyout-icp\"]/div[2]/a[3]/span/span[1]")
    WebElement deu;

@FindBy(id = "English")
    WebElement eng;


    @FindBy(id = "nav-al-title")
    WebElement URTitlee;

public  void  ChangLang(){
//    deu.click();
    Assert.assertEquals("Your Lists",URTitlee.getText());

}
    public  void  ChangLangSpa(){
//    deu.click();
        Assert.assertEquals("Tus Listas",URTitlee.getText());

    }
    public  void  ChangLangDeu(){
//    deu.click();
        Assert.assertEquals("Meine Listen",URTitlee.getText());

    }


}
