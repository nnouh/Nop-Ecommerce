Feature: user could be able to select tags
  Background: user can login
    Given go to the homepage
    When user click on login link
    And insert valid data

    Scenario: select tags
      When user go to homePg direct
      And click on tage book
      And assert on the tag book
      And  click on second tag
      And assert on second tag