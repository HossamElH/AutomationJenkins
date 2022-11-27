package runner;

import Test.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Features/login.feature"
        ,glue = {"Steps"}
        ,plugin = {"pretty","html:target/cucumber-html-report.html"},
        publish = true)
public class TestRunner extends TestBase {

    public TestRunner() {
        super("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

}


