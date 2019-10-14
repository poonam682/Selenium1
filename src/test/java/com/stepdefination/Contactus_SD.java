package com.stepdefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import page.contactusPage;
import page.signinPage;

public class Contactus_SD extends webdriverclass {

    public contactusPage sPage = PageFactory.initElements(driver, contactusPage.class);
    public signinPage spage=PageFactory.initElements(driver, signinPage.class);

    @When("^I click on Contact us button$")
    public void iClickOnContactUsButton() {
        sPage.clickcontactusbutton();
     }

    @Given("^I select \"([^\"]*)\" from subject heading drop down box$")
    public void iSelectFromSubjectHeadingDropDownBox(String subjectheading){
        sPage.selectfromdropbox(subjectheading);
    }

    @Given("^I enter order reference as \"([^\"]*)\"$")
    public void iEnterOrderReferenceAs(String orderref) {
        sPage.enterorderReference(orderref);
    }

    @Given("^I enter text in message box as \"([^\"]*)\"$")
    public void iEnterTextInMessageBoxAs(String textmessage) {
        sPage.enterTextmessage(textmessage);
    }

    @When("^I click on send button$")
    public void iClickOnSendButton() {
        sPage.clicksendbutton();
    }

    @Then("^I should see text as \"([^\"]*)\"$")
    public void iShouldSeeTextAs(String expectedtext) {
        sPage.checkTextmessage(expectedtext);
    }

    @And("^I should see contact us button on home page$")
    public void iShouldSeeContactUsButtonOnHomePage() {
        sPage.checkcontactusbutton();
    }

    @And("^I should see \"([^\"]*)\" text on contact us button$")
    public void iShouldSeeTextOnContactUsButton(String expectedtext) {
        sPage.textoncontactusButton(expectedtext);
    }

    @Given("^I enter email id as \"([^\"]*)\" in contact us page$")
    public void iEnterEmailIdAsInContactUsPage(String emailid) {
        spage.enterEmailid(emailid);
    }

   @Then("^I should see error message as \"([^\"]*)\" with no data$")
    public void iShouldSeeErrorMessageAsWithNoData(String expectedErrormessage)  {
        sPage.errormessagewithNodata(expectedErrormessage);
    }

    @Then("^I should see error message as \"([^\"]*)\" with no message$")
    public void iShouldSeeErrorMessageAsWithNoMessage(String expectedErrormessage) {
        sPage.errormessagewithnoTextmessage(expectedErrormessage);
    }

    @Then("^I should see error message as \"([^\"]*)\" with no email id$")
    public void iShouldSeeErrorMessageAsWithNoEmailId(String expectedErrormessage) {
        sPage.errormessagewithnoEmailid(expectedErrormessage);
    }

    @Then("^I should see error message as \"([^\"]*)\" with no heading$")
    public void iShouldSeeErrorMessageAsWithNoHeading(String expectedErrormessage)  {
        sPage.errormessgaewithnoheading(expectedErrormessage);
    }


    @Given("^I dont select subject heading from the list provided$")
    public void iDontSelectSubjectHeadingFromTheListProvided() {
    sPage.nosubjectheading();
    }
}
