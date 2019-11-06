Feature: Myaccount
@account
  Scenario: Signin to see Myaccount Page
    When I click on sing in button on home page
    Given I enter email id as "punam82@gmail.com"
    Given I enter password as "pw123"
    Then I should see "Authentication" page
    And I should see "ORDER HISTORY AND DETAILS" section





