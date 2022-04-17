Feature: user could be able to search for products
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

    Scenario: filter by color
      When go to homepage logo
      And hover on appearl category and click on shoes
     Then choose red color and click on it

