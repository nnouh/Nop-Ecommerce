@smoke
Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

  Scenario: Add to cart first item
    When go to homepage logo to Add
    And click on link Book
    And click on book item.
    Then Click on Add to Cart
    And check the text

  Scenario: Add to cart second item
    When click on link Book to add second item
    And click on book item to add second item
    Then Click on Add to Cart to add second item
    And check the text to add second item
