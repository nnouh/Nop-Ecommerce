@smoke
Feature: user could be able to Login
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data
#   And click on submit
#    Then redirect the user to homepage

  Scenario: user can change password
    When  click on my account link
    And click on change password
    And add new password
    And click on button reset

