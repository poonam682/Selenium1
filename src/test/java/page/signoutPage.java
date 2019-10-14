package page;

import com.stepdefination.webdriverclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class signoutPage extends webdriverclass {

    Boolean actualButton;
    String actualText;
    public void checksignoutbutton() {
        actualButton=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).isDisplayed();
        Assert.assertTrue(actualButton);
    }

    public void checksignouttext(String expectedText) {
        int signoutElements = driver.findElements(By.linkText("Contact us")).size();

        actualText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText();
        Assert.assertEquals(actualText,expectedText);
       }

    public void clicksignoutbutton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
    }

    public void nosignoutbuttonseen() {
        int signoutElements = driver.findElements(By.linkText("Sign out")).size();
        Assert.assertEquals(0,signoutElements);






    }
}
