package page;

import com.stepdefination.webdriverclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class contactusPage extends webdriverclass {

    String actualtext;
    String expectedtext;
   String expectedErrormessage;
   String actualErrormessage;
    Boolean actualbutton;

    public void clickcontactusbutton(){
        driver.findElement(By.id("contact-link")).click();
    }

    public void selectfromdropbox(String subjectheading){
        new Select(driver.findElement(By.id("id_contact"))).selectByIndex(1);
    }

    public void enterorderReference(String orderref){
        driver.findElement(By.id("id_order")).sendKeys(orderref);
    }

    public void enterTextmessage(String textmessage){
        driver.findElement(By.id("message")).sendKeys(textmessage);
    }
    public void clicksendbutton(){
        driver.findElement(By.id("submitMessage")).click();
    }

    public void checkTextmessage(String expectedtext){
        actualtext=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(expectedtext,actualtext);
    }

    public void checkcontactusbutton(){
        actualbutton=driver.findElement(By.id("contact-link")).isDisplayed();
        Assert.assertTrue(actualbutton);
    }
    public void textoncontactusButton(String expectedtext){
        actualtext=driver.findElement(By.id("contact-link")).getText();
        Assert.assertEquals(expectedtext,actualtext);
    }

    public void errormessgaewithnoheading(String expectedErrormessage){
        actualErrormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertEquals(expectedErrormessage,actualErrormessage);
    }

    public void errormessagewithnoEmailid(String expectedErrormessage){
        actualErrormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertEquals(expectedErrormessage,actualErrormessage);
    }

    public void errormessagewithnoTextmessage(String expectedErrormessage){
        actualErrormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertEquals(expectedErrormessage,actualErrormessage);
    }

    public void errormessagewithNodata(String expectedErrormessage){
        actualErrormessage=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertTrue(actualErrormessage.contains(expectedErrormessage));
    }

    public void nosubjectheading(){
        new Select(driver.findElement(By.id("id_contact"))).selectByIndex(0);
    }
}

