Feature: Search

  Background:
    Then I should see search button on home page

  Scenario Outline:
    Given I enter "<searchWord>" in search field on home page
    When I click on search button on home page
    Then I should see title as "<searchTitle>"
    And I should see result text as "<searchText>"

    Examples:
      | searchWord     | searchTitle    | searchText                 |
      | SHIRT          | SHIRT          | 1 result has been found.   |
      | DRESSES        | DRESSES        | 7 results have been found. |
      | SUMMER DRESSES | SUMMER DRESSES | 4 results have been found. |

  Scenario:
    Given I enter "" in search field on home page
    When I click on search button on home page
    Then I should see search result title as "Please enter a search keyword"
    And I should see search result text as "0 results have been found."




