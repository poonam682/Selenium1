package com.stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import page.signoutPage;

public class Signout_SD extends webdriverclass {
    public signoutPage sPage = PageFactory.initElements(driver,signoutPage.class);

    @Then("^After successful Sign in I should see Sign out button on my account page$")
    public void afterSuccessfulSignInIShouldSeeSignOutButtonOnMyAccountPage() {
        sPage.checksignoutbutton();
    }

    @And("^I should see text as \"([^\"]*)\" on signout button$")
    public void iShouldSeeTextAsOnSignoutButton(String expectedText)  {
        sPage.checksignouttext(expectedText);
    }

    @When("^I click on Sign out I should see Sign in Button$")
    public void iClickOnSignOutIShouldSeeSignInButton() {
        sPage.clicksignoutbutton();
    }

    @And("^I should not see signout button$")
    public void iShouldNotSeeSignoutButton() {
        sPage.nosignoutbuttonseen();
    }
}
