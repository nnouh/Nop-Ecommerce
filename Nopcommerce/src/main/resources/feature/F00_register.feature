Feature: user could be able to register
  Scenario: user could find register form by clicking on register button
    Given navigate to the homepage url
    When user click on register button
    And fill valid data into registration form
    And click on submit button
    Then user should be find message



