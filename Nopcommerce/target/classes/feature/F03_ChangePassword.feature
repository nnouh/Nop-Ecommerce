Feature: user can change his password
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

Scenario: user can change password
When  click on my account link
And click on change password
And add new password
And click on button reset