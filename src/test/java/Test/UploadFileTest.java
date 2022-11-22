package Test;

import Pages.UploadFilePage;
import org.testng.annotations.Test;

public class UploadFileTest extends TestBase{
public UploadFileTest(){
    super("https://www.monsterindia.com/seeker/registration");
}
UploadFilePage UploadObject;
@Test
    public void UploadFileTestt(){
        UploadObject = new UploadFilePage(driver);
        UploadObject.uploaad();
}


}
