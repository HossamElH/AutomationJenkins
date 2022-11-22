package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollDownTOBottonOfThePageTest extends TestBase{
    public  ScrollDownTOBottonOfThePageTest(){
        super("https://codebase.show/projects/realworld");
    }

    @Test
    public void ScrollingToBotton() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,600)");

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/footer/nav/div[2]/div/a[4]")).isDisplayed());

    }
}
