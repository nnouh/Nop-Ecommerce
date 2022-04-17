
Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

  Scenario: user search
    When  user click on homepage
    And user click on button search
    Then user could find relative result