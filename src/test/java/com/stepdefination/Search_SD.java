package com.stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import page.searchPage;

public class Search_SD extends webdriverclass {
    public searchPage sPage = PageFactory.initElements(driver, searchPage.class);

    Boolean actualButton;

    @Then("^I should see search button on home page$")
    public void iShouldSeeSearchButtonOnHomePage() {
        sPage.searchbuttondisplay();
    }

    @Given("^I enter \"([^\"]*)\" in search field on home page$")
    public void iEnterInSearchFieldOnHomePage(String searchWord) {
        sPage.entersearchWord(searchWord);
    }


    @When("^I click on search button on home page$")
    public void iClickOnSearchButtonOnHomePage() {
        sPage.clicksearchButton();
    }

    @Then("^I should see title as \"([^\"]*)\"$")
    public void iShouldSeeTitleAs(String expectedTitle)  {
        sPage.checksearchTitle(expectedTitle);

    }

    @And("^I should see result text as \"([^\"]*)\"$")
    public void iShouldSeeResultTextAs(String expectedText)  {
        sPage.checksearchText(expectedText);
    }

    @Then("^I should see search result title as \"([^\"]*)\"$")
    public void iShouldSeeSearchResultTitleAs(String expectedTitle) {
        sPage.searcherrorTitle(expectedTitle);

    }

    @And("^I should see search result text as \"([^\"]*)\"$")
    public void iShouldSeeSearchResultTextAs(String expectedText)  {
        sPage.searcherrorText(expectedText);

    }
}
