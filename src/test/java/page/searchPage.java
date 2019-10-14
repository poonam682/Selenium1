package page;

import com.stepdefination.webdriverclass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class searchPage extends webdriverclass {

Boolean actualButton;
String actualText;
String actualTitle;
String expectedText;
String expectedTitle;

    public void searchbuttondisplay() {
        actualButton=driver.findElement(By.name("submit_search")).isDisplayed();
    }

    public void entersearchWord(String searchWord) {
        driver.findElement(By.name("search_query")).sendKeys(searchWord);
    }

    public void clicksearchButton() {
        driver.findElement(By.name("submit_search")).click();
    }

    public void checksearchTitle(String expectedTitle) {

        actualTitle=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public void checksearchText(String expectedText) {

        actualText=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
           Assert.assertEquals(actualText,expectedText);

    }

    public void searcherrorTitle(String expectedTitle) {
        actualTitle=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void searcherrorText(String expectedText) {
        actualText=driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span")).getText();
        Assert.assertEquals(actualText,expectedText);
    }
}
