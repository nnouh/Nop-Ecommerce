Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

  Scenario: Add to wish list first item
    When go to homepage logo to Add to wish list
    And click on link Apparel
    And click on shose item
    Then Click on Add to wish list
    And check the text to assert

  Scenario: Add to wish list second item
    When click on link book to add to wish
    And click on second item
    Then Click on Add to wishList
    And check the text to assert second