package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheSecondHighestPrice_PAge extends PageBase{
    public TheSecondHighestPrice_PAge(WebDriver driver){
        super(driver);
    }

//    @FindBy(xpath = "//*[@id=\"login_credentials\"]/text()[1]")
//    WebElement theUser;
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()")
//    WebElement ThePAss;
    @FindBy(id = "user-name")
    WebElement UserNameField;

    @FindBy(id = "password")
    WebElement PassWordField;
    @FindBy(id = "login-button")
    WebElement LoginBtn;
    @FindBy(className = "inventory_item_price")
    List<WebElement> Price;


    public void FindThePrice(String u,String p) {
        UserNameField.sendKeys(u);
        PassWordField.sendKeys(p);
        LoginBtn.click();
        String gg;
        List<Float> sortted = new ArrayList<>();
        String j;
        float m;
        int x ;
        // Price.remove(Character.valueOf('$'));
        for (int i = 0; i < Price.size(); i++) {
            gg = Price.get(i).getText();
            j = gg.replace("$", "");
            m = Float.parseFloat(j);
            sortted.add(m);
            // System.out.println(j);
//          sortted.add(Integer.parseInt(Price.get(i).getText()));
            System.out.println(sortted.get(i));
        }
        x = sortted.size();
        Collections.sort(sortted);
        System.out.println("The second hightest price is: "+ sortted.get(x-2));


    }



}
