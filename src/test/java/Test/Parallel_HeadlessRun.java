package Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Parallel_HeadlessRun {
    LoginPage l ;
    // static WebDriver driver;
    public static ThreadLocal<ChromeDriver> driverr = new ThreadLocal<>();


    @Test
    public void NegativeOne(){
        l= new LoginPage(getDriver());
        l.Cucum_Loginsuccessfully("Ain","admin123");
        l.Cucum_clickonLogin();
        Assert.assertTrue(l.fff);


    }
    @Test
    public void PosativeTest(){

        l= new LoginPage(getDriver());

        l.Cucum_Loginsuccessfully("Admin","admin123");
        l.Cucum_clickonLogin();
        Assert.assertTrue(l.AssertThatUserLoginSucc);
    }


    @BeforeMethod
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        //options.addArguments("--headless");
        driverr.set(new ChromeDriver());
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public WebDriver getDriver(){
        return driverr.get();
    }

        @AfterMethod
    public void StopDriver()  {

            getDriver().quit();
           driverr.remove();

    }



}
