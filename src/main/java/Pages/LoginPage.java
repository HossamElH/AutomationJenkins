package Pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement username;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement password;
  @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
   WebElement login;

@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")
 WebElement logo ;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    WebElement invalid_message ;
    WebDriverWait wait;
    WebElement btn;

    public static boolean AssertThatUserLoginSucc= false;
    public static boolean fff= false;

    public void  Loginsuccessfully(String userr , String pass)  {
        username.sendKeys(userr);
        password.sendKeys(pass);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn = wait.until(ExpectedConditions.elementToBeClickable(login));
        btn.click();
        AssertThatUserLoginSucc = logo.isDisplayed();


    }
    public void  CantLoginsuccessfully(String userr , String pass)  {
        username.sendKeys(userr);
        password.sendKeys(pass);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        btn = wait.until(ExpectedConditions.elementToBeClickable(login));
        btn.click();
        AssertThatUserLoginSucc = invalid_message.isDisplayed();


    }

    public void SAVECookies(WebDriver driver,String userrr,String passs){
        Cookie usernameCookie = new Cookie("username",userrr);
        Cookie passCookie = new Cookie("password",passs);
        driver.manage().addCookie(usernameCookie);
        driver.manage().addCookie(passCookie);
    }
    public void Cucum_Loginsuccessfully(String userr , String pass) {
        username.sendKeys(userr);
        password.sendKeys(pass);
    }
    public void Cucum_clickonLogin() {

        try {
            login.click();
            driver.navigate().refresh();
            AssertThatUserLoginSucc = logo.isDisplayed();
        }
    catch(Exception exception) {
        driver.navigate().refresh();
        fff = true;


    }
    }
}
