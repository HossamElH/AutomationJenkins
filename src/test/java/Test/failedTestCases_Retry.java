package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failedTestCases_Retry {

    int x =0;

    @Test(retryAnalyzer = Listner.RetryListnerrForTestFailed.class)
    public void Faield(){

        System.out.println("Faild number"+ ++x);
        Assert.assertTrue(0>1);
    }
}
