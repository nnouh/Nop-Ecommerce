
Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

  Scenario: Switch between currencies Us-Eur
   When  user click on homepage logo
    Then user click on currencies US-Euro
#     Then the selected value should appear