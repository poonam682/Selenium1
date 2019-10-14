Feature: Create an Account

  Background:
    When I click on sing in button on home page
    Then I should see Create an account button on Authentication page
    And I should see text as "Create an account" on Create an account button

  @create
  Scenario: Email id empty  Negative scenario
    Given I enter email id as ""
    When I click on Create an account button
    Then I should see error message as "Invalid email address." on authentication page

  @registeration
  Scenario: Entering all mandatory fields
    Given I enter email id as "punam826@gmail.com" in authentication filed
    When I click on Create an account button
    Then I should see heading as "CREATE AN ACCOUNT" on authentication page
    Given I enter below details in your personal information section:
      | First name | Last name | Email | Password | DOB       |
      | Poonam     | Patel     |       | pw123    | 6/10/1982 |
    When I click "sign up for our newsletter!"
    And I click "Receive special offers from our partners!" other box

    Given I enter below details in Your address section:
      | First name | Last name | Address   | City       | State   | Zip/Postal Code | Country       | Mobile phone | Assign an address alias for future reference |
      |            |           | suite 219 | Scottsdale | Arizona | 85260           | United States | 07877684133  | My address                      |
     When I click on Register Button
     Then I should see "My account" page


