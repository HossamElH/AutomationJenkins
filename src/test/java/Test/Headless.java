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

public class Headless {
    LoginPage l ;
    static WebDriver driver;

    @Test
    public void HeadlessPosativeTest(){
        l= new LoginPage(driver);
        l.Cucum_Loginsuccessfully("Admin","admin123");
        l.Cucum_clickonLogin();
        Assert.assertTrue(l.AssertThatUserLoginSucc);


    }

//    @Test
//    public void NegativeOne(){
//        l= new LoginPage(driver);
//
//        l.Cucum_Loginsuccessfully("Ain","admin123");
//        l.Cucum_clickonLogin();
//        Assert.assertTrue(l.fff);
//
//
//    }
    @BeforeTest
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }

    @AfterTest
    public static void StopDriver()  {

        driver.quit();
    }



}
