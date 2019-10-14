package com.stepdefination;

import com.stepdefination.webdriverclass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import page.signinPage;

import java.sql.Array;
import java.util.ArrayList;

public class signin_SD extends webdriverclass {

public signinPage spage = PageFactory.initElements(driver,signinPage.class);

    @When("^I click on sing in button on home page$")
    public void iClickOnSingInButtonOnHomePage() throws InterruptedException {
        spage.clicksigninButton();
    }

    @Given("^I enter email id as \"([^\"]*)\"$")
    public void iEnterEmailIdAs(String emailid)  {
        spage.enterEmailid(emailid);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        spage.enterpassword(password);
     }

    @When("^I click on sign in button on sign in page$")
    public void iClickOnSignInButtonOnSignInPage() {
        spage.submitsigninButton();
    }

    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String expected_errormsg) {
        spage.checkerrormessage(expected_errormsg);
    }

    @And("^I should see sign in button$")
    public void iShouldSeeSignInButton() {
         spage.checksigninbutton();
    }

    @And("^I should see \"([^\"]*)\" text on the Sign in Button$")
    public void iShouldSeeTextOnTheSignInButton(String expectedText)  {
        spage.checktextonsigninbutton(expectedText);
       }

    @Then("^I should see error message as \"([^\"]*)\" on top$")
    public void iShouldSeeErrorMessageAsOnTop(String expected_errormsg)  {
        spage.errormessagefornoemailid(expected_errormsg);
    }

    @Then("^I should see error message as \"([^\"]*)\" for no password$")
    public void iShouldSeeErrorMessageAsForNoPassword(String expected_errormsg)  {
        spage.errormessagefornopassowrd(expected_errormsg);
    }

    @Then("^I should see error message as \"([^\"]*)\" for no data entering$")
    public void iShouldSeeErrorMessageAsForNoDataEntering(String expected_errormsg)  {
        spage.errormessagefornodataenter(expected_errormsg);
    }















}

