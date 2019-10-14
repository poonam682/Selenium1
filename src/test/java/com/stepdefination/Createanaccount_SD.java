package com.stepdefination;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.createanAccountPage;

public class Createanaccount_SD extends webdriverclass{
    public createanAccountPage sPage = PageFactory.initElements(driver, createanAccountPage.class);

    @Then("^I should see Create an account button on Authentication page$")
    public void iShouldSeeCreateAnAccountButtonOnAuthenticationPage() {
        sPage.createanaccountButton();
    }

    @And("^I should see text as \"([^\"]*)\" on Create an account button$")
    public void iShouldSeeTextAsOnCreateAnAccountButton(String expectedText) {

        sPage.createanaccountText(expectedText);
    }

    @When("^I click on Create an account button$")
    public void iClickOnCreateAnAccountButton() throws InterruptedException {
        sPage.clickoncreateanaccountButton();
    }

    @Then("^I should see error message as \"([^\"]*)\" on authentication page$")
    public void iShouldSeeErrorMessageAsOnAuthenticationPage(String expectederrorMessage) {
        sPage.errormessageonauthenticationpage(expectederrorMessage);

    }


    @Then("^I should see heading as \"([^\"]*)\" on authentication page$")
    public void iShouldSeeHeadingAsOnAuthenticationPage(String expectedText)  {
        sPage.createanaccountHeader(expectedText);
    }


    @Given("^I enter email id as \"([^\"]*)\" in authentication filed$")
    public void iEnterEmailIdAsInAuthenticationFiled(String newemailid)  {
        sPage.enternewemailid(newemailid);
    }

    @Given("^I enter below details in your personal information section:$")
    public void iEnterBelowDetailsInYourPersonalInformationSection(DataTable table) throws InterruptedException {
        sPage.enterdetails(table);

    }

    @When("^I click \"([^\"]*)\"$")
    public void iClick(String checkbox)  {
        sPage.clickcheckbox(checkbox);
    }

    @And("^I click \"([^\"]*)\" other box$")
    public void iClickOtherBox(String checkbox1) {
        sPage.clickcheckbox1(checkbox1);
    }

    @Given("^I enter below details in Your address section:$")
    public void iEnterBelowDetailsInYourAddressSection(DataTable table1) throws InterruptedException {
        sPage.enterdetailsintable(table1);
    }

    @When("^I click on Register Button$")
    public void iClickOnRegisterButton() throws InterruptedException {
        sPage.clickrigesterbutton();
    }

    @Then("^I should see \"([^\"]*)\" page$")
    public void iShouldSeePage(String expectedText) {
        sPage.myaccountpage(expectedText);
    }
}
