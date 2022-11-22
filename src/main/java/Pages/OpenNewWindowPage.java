package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OpenNewWindowPage extends PageBase{
    public OpenNewWindowPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/section[3]/div/div/div[2]/div[1]/a[1]")
    WebElement TwitterBTN;

   public List<String> alltitels = new ArrayList<String>();
    String ParentWindow = driver.getWindowHandle();
        public void OPenNewWindow(){
            WebDriverWait wait;
            WebElement btn;
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            btn = wait.until(ExpectedConditions.elementToBeClickable(TwitterBTN));
            btn.click();

            for(String WindoID : driver.getWindowHandles())
            {
                    alltitels.add(driver.getTitle());
                String title = driver.switchTo().window(WindoID).getTitle();
                if(title.equals("Twitter"))
                {
                    Assert.assertEquals("Twitter",driver.getTitle());
                    driver.close();
                    break;
                }

            }
            driver.switchTo().window(ParentWindow);

        }



}
