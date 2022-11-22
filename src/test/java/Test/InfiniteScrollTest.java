package Test;

import Pages.InfiniteScroll;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends TestBase{
public InfiniteScrollTest(){
    super("https://the-internet.herokuapp.com/infinite_scroll");
}
InfiniteScroll f;

@Test
    public void doinfinityScroll(){
     f = new InfiniteScroll(driver);
    while(f.getFooter().isDisplayed()){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
}
