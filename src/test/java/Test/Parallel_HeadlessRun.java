package Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Parallel_HeadlessRun {
    LoginPage l ;
    // static WebDriver driver;
    protected static ThreadLocal<ChromeDriver> driverr = new ThreadLocal<>();


    @Test
    public void HeadlessPosativeTest(){

        l= new LoginPage(getDriver());

    l.Cucum_Loginsuccessfully("Admin","admin123");
    l.Cucum_clickonLogin();
   Assert.assertTrue(l.AssertThatUserLoginSucc);


    }

    @Test
    public void NegativeOne(){
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        l= new LoginPage(getDriver());

        l.Cucum_Loginsuccessfully("Ain","admin123");
        l.Cucum_clickonLogin();
        Assert.assertTrue(l.fff);


    }
    @BeforeTest
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        //options.addArguments("--headless");
        options.setHeadless(true);
        driverr.set(new ChromeDriver(options));
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //getDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public WebDriver getDriver(){
        return driverr.get();
    }

        @AfterTest
    public void StopDriver()  {

            getDriver().quit();

    }



}
