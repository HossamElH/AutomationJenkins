package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RecruitmentTabUsingKeyBoardPage extends PageBase {
    public RecruitmentTabUsingKeyBoardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement username;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")
    WebElement logo;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
    WebElement RecBTN;
    WebDriverWait wait;
    WebElement btn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    WebElement VACC ;

    public boolean AssertThatUserLoginSucc = false;

    public void Loginsuccessfully(String userr, String pass, WebDriver driver) {
        username.sendKeys(userr);
        password.sendKeys(pass);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn = wait.until(ExpectedConditions.elementToBeClickable(login));
        btn.click();
        AssertThatUserLoginSucc = logo.isDisplayed();

    }
    public void openrecrutment() throws AWTException {
        RecBTN.click();
//        Actions actions = new Actions(driver);
//        actions.keyDown(Keys.CONTROL).sendKeys("l").sendKeys("c").sendKeys("t").sendKeys("v").keyUp(Keys.ENTER).perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ENTER);

//Switch focus to new tab
    }
    public void openVacancies()  {
        RecBTN.click();
//        WebElement h =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul"));
//        Select dropp = new Select(h);
//        Assert.assertFalse(dropp.isMultiple());
//        Assert.assertEquals(2,dropp.getOptions().size());
//        dropp.selectByIndex(1);
        VACC.click();
    }

    public void HoverOnRecrutment(WebDriver driver)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(RecBTN).perform();
    }
}
