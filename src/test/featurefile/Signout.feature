Feature: signout
@signout
  Scenario:
    When I click on sing in button on home page
    Given I enter email id as "punam@gmail.com"
    Given I enter password as "pw123"
    When I click on sign in button on sign in page
    Then After successful Sign in I should see Sign out button on my account page
    And I should see text as "Sign out" on signout button
    When I click on Sign out I should see Sign in Button
    Then I should see sign in button
    And I should not see signout button
