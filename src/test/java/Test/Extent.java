package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Extent {

    private  static WebDriver driver;

 public static void main(String[]args){

     ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentFile.html");

     TheSecondHighestPrice_MasterTest g;

     ExtentReports extent = new ExtentReports();
     extent.attachReporter(htmlReporter);
     ExtentTest test1 = extent.createTest("Open recrutment in new tab", "Sample description");


     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     test1.log(Status.INFO,"starting test");
     driver.get("https://trytestingthis.netlify.app/");
     test1.pass("navigate successfully");
     WebElement c =driver.findElement( By.id("day"));
     test1.pass("find the celenar successgully");
        c.sendKeys("10262023");
     test1.pass("done");
     c.sendKeys(Keys.TAB);

        driver.close();
        driver.quit();
     test1.pass("test is done");
     extent.flush();
        }


}