package page;

import com.stepdefination.webdriverclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

public class signinPage extends webdriverclass {

    String actual_errormessage;
    String expected_errormessage;
    Boolean actualButton;
    String actualText;
    String expectedText;

    WebDriverWait wait = new WebDriverWait(driver,120);

    //Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(120,TimeUnit.SECONDS).pollingEvery(10,TimeUnit.SECONDS);

public void clicksigninButton() throws InterruptedException {
    driver.findElement(By.linkText("Sign in")).click();
    //Thread.sleep(60000);
    //58 wasting ==> scripts are not performing well.
    //61 seconds. ==> scripts fail
 //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   // wait1.until(ExpectedConditions.elementToBeClickable(By.id("something")));


    //recommandation ONLY
   // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SubmitCreate1")));
    //wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitCreate1")));
}

public void enterEmailid(String emailid){

    driver.findElement(By.id("email")).sendKeys(emailid);
}
public void enterpassword(String password){

    driver.findElement(By.id("passwd")).sendKeys(password);
}

public void submitsigninButton(){
    driver.findElement(By.id("SubmitLogin")).click();
}


public void checkerrormessage(String expected_errormessage){

    actual_errormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
    Assert.assertEquals(expected_errormessage,actual_errormessage);
    Assert.assertTrue(actual_errormessage.contains("Authentication"));

}

public void checksigninbutton(){

    actualButton=driver.findElement(By.name("SubmitLogin")).isDisplayed();
    Assert.assertTrue(actualButton);
}

public void checktextonsigninbutton(String expectedText){

    actualText=driver.findElement(By.name("SubmitLogin")).getText();
    Assert.assertTrue(actualText.contains(expectedText));
}

public void errormessagefornoemailid(String expected_errormessage){

    actual_errormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
    Assert.assertEquals(expected_errormessage,actual_errormessage);
}

public void errormessagefornopassowrd(String expected_errormessage){

    actual_errormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
    Assert.assertEquals(expected_errormessage,actual_errormessage);

}
public void errormessagefornodataenter(String expected_errormessage){
    actual_errormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
    Assert.assertTrue(actual_errormessage.contains(expected_errormessage));
}

}