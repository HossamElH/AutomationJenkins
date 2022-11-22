package Steps;

import Pages.LoginPage;
import Test.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs extends TestBase {

    public MyStepdefs() {
        super("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
LoginPage l;

 @Given("the User is at Login Page")
    public  void check_User()
 {
     System.out.println("Iam in ");
 }

 @When("User Enter {string} , {string}")
    public void Login (String user,String pass)
 {
     l = new LoginPage(driver);
     l.Cucum_Loginsuccessfully("Admin","admin123");
 }

 @When("Click on Login Button")
    public void Click ()
 {
     l = new LoginPage(driver);
     l.Cucum_clickonLogin();
 }

 @Then("user Logged in Successfully")
    public void Check_HommePage()
 {
     l = new LoginPage(driver);
     Assert.assertTrue(l.AssertThatUserLoginSucc);
 }


}
