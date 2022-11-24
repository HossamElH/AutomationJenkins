package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinkPage extends PageBase {
    public BrokenLinkPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(tagName = "a")
    List<WebElement> links;
    List<String> UrlList;
    static List<String> BrokUrl;

    public void g(String url) {
        UrlList = new ArrayList<>();
        for (WebElement s : links) {
            String urll = s.getAttribute("href");
            UrlList.add(urll);
        }
        long sttime = System.currentTimeMillis();
        UrlList.parallelStream().forEach(e -> checkUrl(e));
        long endtime = System.currentTimeMillis();

    }

    public static void checkUrl(String linkUrrl) {

        BrokUrl = new ArrayList<>();
        try {
            {
                URL u = new URL(linkUrrl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) u.openConnection();
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.connect();
                if ( httpURLConnection.getResponseCode() >= 400) {
                    System.out.println(linkUrrl +"--------"+httpURLConnection.getResponseMessage());
                    //BrokUrl.add(httpURLConnection.getResponseMessage());
                }
            }

        } catch (IOException e) {

        }
    }
}

