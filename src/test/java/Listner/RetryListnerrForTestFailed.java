package Listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListnerrForTestFailed implements IRetryAnalyzer {
    private int retCounter = 0;
    private static final int maxretry =3;

    @Override
    public boolean retry(ITestResult result)
    {
        if(retCounter < maxretry)
        {
            retCounter++;
            return true;
        }
        return  false;
    }
}
