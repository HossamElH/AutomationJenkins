package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintTitleWithJavaScript extends TestBase{
    public PrintTitleWithJavaScript(){
        super("https://opensource-demo.orangehrmlive.com/");
    }
    @Test
    public void JavaScriptPrintTitle(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String title = (String) js.executeScript("return document.title");
        Assert.assertEquals("OrangeHRM",title);
        System.out.println(title);

    }
}
