@regression
Feature: contact us by Github test

  Background:
    When I click on Contact us button

  Scenario: Entering all data Positive scenario
    Given I select "customer service" from subject heading drop down box
    Given I enter email id as "punam@gmail.com" in contact us page
    Given I enter order reference as "ref123"
#    Given I attach file
    Given I enter text in message box as "query regarding my order"
    When I click on send button
    Then I should see text as "Your message has been successfully sent to our team."
    And I should see contact us button on home page
    And I should see "Contact us" text on contact us button

  Scenario: Entering all data except subject heading Negative scenario
    Given I dont select subject heading from the list provided
    Given I enter email id as "punam@gmail.com" in contact us page
    Given I enter order reference as "ref123"
#    Given I attach file
    Given I enter text in message box as "query regarding my order"
    When I click on send button
    Then I should see error message as "Please select a subject from the list provided." with no heading

  Scenario: Entering all data except email id Negative scenario
    Given I select "webmaster" from subject heading drop down box
    Given I enter email id as "" in contact us page
    Given I enter order reference as "ref123"
#    Given I attach file
    Given I enter text in message box as "query regarding my order"
    When I click on send button
    Then I should see error message as "Invalid email address." with no email id

  Scenario: Entering all data except message Negative scenario
    Given I select "customer service" from subject heading drop down box
    Given I enter email id as "punam@gmail.com" in contact us page
    Given I enter order reference as "ref123"
#    Given I attach file
    Given I enter text in message box as ""
    When I click on send button
   Then I should see error message as "The message cannot be blank." with no message

    @smoke
  Scenario: Entering no data Negative scenario
    Given I select "" from subject heading drop down box
    Given I enter email id as ""
    Given I enter order reference as ""
#    Given I dont attach file
    Given I enter text in message box as ""
    When I click on send button
    Then I should see error message as "Invalid email address." with no data

