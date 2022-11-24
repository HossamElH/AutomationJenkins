package Test;

import Pages.LocationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocationTest{
   public static WebDriver driver;
    LocationPage l ;
  public static int i =-1;
  String []arr={"--lang=es","--lang=en","--lang=de"} ;

    @Test(priority = 1)
    public void toEspsn (){
        WebDriverManager.chromedriver().setup();



//        options.addArguments("");
//
//         driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.amazon.com/ref=nav_logo");
        l = new LocationPage(driver);
        l.ChangLangSpa();
    }
    @Test(priority = 2)
    public void toEng (){
//        WebDriverManager.chromedriver().setup();
//
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--lang=en");
//
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.amazon.com/ref=nav_logo");
        l = new LocationPage(driver);
        l.ChangLang();
    }
    @Test(priority = 3)
    public void toDeu (){

        l = new LocationPage(driver);
        l.ChangLangDeu();
    }
    @BeforeMethod
    public void beforee(){
        WebDriverManager.chromedriver().setup();


        ChromeOptions options = new ChromeOptions();
        options.addArguments(arr[++i]);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/ref=nav_logo");
    }
    @AfterMethod
    public static void StopDriver()  {

        driver.quit();
    }


    }
