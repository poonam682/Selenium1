
Feature: Signin

  Background:
    When I click on sing in button on home page

    @smoke
  Scenario: sign in with valid data positive scenario
    Given I enter email id as "punam@gmail.com"
    And I enter password as "pw123"
    When I click on sign in button on sign in page
    Then I should see error message as "Authentication failed."
    And I should see sign in button
    And I should see "Sign in" text on the Sign in Button

  @smoke
  Scenario: Sign in with no email id
    Given I enter email id as ""
    And I enter password as "pw123"
    When I click on sign in button on sign in page
    Then I should see error message as "An email address required." on top
@smoke
  Scenario: Sign in with no password
    Given I enter email id as "punam@gmail.com"
    And I enter password as ""
    When I click on sign in button on sign in page
    Then I should see error message as "Password is required." for no password

  Scenario: Sign in with no data
    Given I enter email id as ""  
    And I enter password as ""
    When I click on sign in button on sign in page
    Then I should see error message as "An email address required." for no data entering