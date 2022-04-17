Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

    Scenario: random category
      When go to the homepage first
      Then user select category