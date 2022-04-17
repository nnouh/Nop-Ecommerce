@smoke
Feature:
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

  Scenario: :
    When go to homepage logo to Add
    And click on link Book
    And click on book item.
    Then Click on Add to Cart

  Scenario: successful order
    When click on shipping cart
    And fill the form
    And click on second tab
    And click on payment button
    And payment Information
    And confirm order
    Then assert the text