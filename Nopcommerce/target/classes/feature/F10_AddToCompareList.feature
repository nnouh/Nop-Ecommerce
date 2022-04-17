Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

  Scenario: Add to compare list first item
    When go to homepage logo to Add to compare list
    And click on link Apparel to compare list
    And click on shose item to compare list
    Then Click on Add to compare list
    And check the text to compare list assert

  Scenario: Add to compare list second item
   When click on link book to add to compare list
    And click on second item to compare list
    Then Click on Add to compare list second
     And check the text to assert second to compare list