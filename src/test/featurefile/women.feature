Feature: Women

  @women
  Scenario Outline: positive scenario
    Then I should see "Women" section on home page
    When I click on "<women>" button
    Then I should see title as "<Title>"
    And I should see result text as "<result>"
#  Then I should see "Tops" section on women page
#  When I click on Tops subcategory
#  And I should see "Dresses" section on women page also

    Examples:
      | women    | Title    | result               |
      | WOMEN    | WOMEN    | There are 7 products. |
      | DRESSES  | DRESSES  | There are 5 products. |
      | T-SHIRTS | T-SHIRTS | There are 1 product.  |


