@creation_email
Feature: negative_email

  Scenario: TC_001 user settings test
    Given user is on the main page
    When user navigates the sing in page
    And user enters Username "group8employee"
    And user enters Password "group8employee"
    And user enters Sing in button
    And user clicks on the username on the top right
    Then user clicks on user info link

@test007
  Scenario:US_007-TC_001 Email id cannot contain just digits or chars without "@" sign or "." extension
    And   user clicks to email button to edit
    And user enter digit and verify the result
    And user enter digit with @ amd . characters
    And user enter char and verify the result
    And user enter char with @ . characters and verifies.



@test007-2
  Scenario:US_007-TC_002 There should not be an option of any other language other than English or Turkish
    And   user clicks to language button
    Then  verifies that language button does not have any other option except English or Turkish
