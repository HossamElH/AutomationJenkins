package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase  extends AbstractTestNGCucumberTests {
    public static WebDriver driver ;
    public static String url;
    public  TestBase(String url)
    {
        this.url = url;
    }


    @BeforeTest
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

    }

//    @AfterTest
//    public static void StopDriver()  {
//
//        driver.quit();
//    }

}
