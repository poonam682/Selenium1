package page;

import com.stepdefination.webdriverclass;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createanAccountPage extends webdriverclass {
    String actualText;
    String expectedText;
    Boolean actualButton;
    String expectederrorMessage;
    String actualerrorMessage;

    WebDriverWait wait = new WebDriverWait(driver, 120);

    public void createanaccountButton() {


        actualButton = driver.findElement(By.id("SubmitCreate")).isDisplayed();
        Assert.assertTrue(actualButton);
    }


    public void createanaccountText(String expectedText) {
        actualText = driver.findElement(By.id("SubmitCreate")).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void clickoncreateanaccountButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitCreate")));
        driver.findElement(By.id("SubmitCreate")).click();

    }


    public void errormessageonauthenticationpage(String expectederrorMessage) {
        actualerrorMessage = driver.findElement(By.id("create_account_error")).getText();
        Assert.assertEquals(expectederrorMessage, actualerrorMessage);
    }


    public void createanaccountHeader(String expectedText) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"noSlide\"]/h1")));

        actualText = driver.findElement(By.xpath("//*[@id=\"noSlide\"]/h1")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    public void enternewemailid(String newemailid) {
        driver.findElement(By.name("email_create")).sendKeys(newemailid);
    }

    public void enterdetails(DataTable table) throws InterruptedException {
        driver.findElement(By.id("customer_firstname")).sendKeys(table.getGherkinRows().get(1).getCells().get(0));
        driver.findElement(By.id("customer_lastname")).sendKeys(table.getGherkinRows().get(1).getCells().get(1));
        driver.findElement(By.name("email")).sendKeys(table.getGherkinRows().get(1).getCells().get(2));
        driver.findElement(By.name("passwd")).sendKeys(table.getGherkinRows().get(1).getCells().get(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("passwd")));
        String dob = table.getGherkinRows().get(1).getCells().get(4);
        String[] dob1 = dob.split("/");
        new Select(driver.findElement(By.name("days"))).selectByValue(dob1[0]);
        new Select(driver.findElement(By.name("months"))).selectByValue(dob1[1]);
        new Select(driver.findElement(By.name("years"))).selectByValue(dob1[2]);
    }

    public void clickcheckbox(String checkbox) {
        if (driver.findElement(By.name("newsletter")).isSelected() == true) {
        } else {
            (driver.findElement(By.name("newsletter"))).click();
        }
    }

    public void clickcheckbox1(String checkbox1) {
        if (driver.findElement(By.id("uniform-optin")).isSelected() == true) {
        } else {
            driver.findElement(By.id("uniform-optin")).click();
        }
    }

    public void enterdetailsintable(DataTable table1) throws InterruptedException {
    driver.findElement(By.name("address1")).sendKeys(table1.getGherkinRows().get(1).getCells().get(2));
    Thread.sleep(2000);
    driver.findElement(By.name("city")).sendKeys(table1.getGherkinRows().get(1).getCells().get(3));
    Thread.sleep(1000);
    table1.getGherkinRows().get(1).getCells().get(4);
    new Select(driver.findElement(By.id("id_state"))).selectByIndex(3);
Thread.sleep(2000);
    driver.findElement(By.id("postcode")).sendKeys(table1.getGherkinRows().get(1).getCells().get(5));

    table1.getGherkinRows().get(1).getCells().get(6);
    new Select(driver.findElement(By.id("id_country"))).selectByIndex(1);
Thread.sleep(2000);
    driver.findElement(By.name("phone_mobile")).sendKeys(table1.getGherkinRows().get(1).getCells().get(7));
    table1.getGherkinRows().get(1).getCells().get(8);
    if (driver.findElement(By.name("alias")).isSelected()==true){
            }
    else {
        driver.findElement(By.name("alias")).sendKeys();
        Thread.sleep(2000);
    }
    }

    public void clickrigesterbutton() throws InterruptedException {
        driver.findElement(By.name("submitAccount")).click();
        Thread.sleep(3000);
    }

    public void myaccountpage(String expectedText) {
        actualText=driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]")).getText();
        Assert.assertEquals(actualText,expectedText);
    }
}

