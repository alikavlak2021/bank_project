@OldPassword
Feature: Old_Password
  @firstExample
  Scenario Outline: Types_Old_Password
    Given user is on the main  page
    And user clicks signInAndRegistrationTab
    And user enters Sing in button
    And user enters username as a customer ""
    And user enters password "<password>"
    And user enters Sing in button
    And user clicks names button
    And user clicks Password button
    And user types current password "<currentPassword>"
    And user types new password "<newPassword>"
   # Then user see the error message
    And user clears the new password fields
    And user enter uppercase char and verify level chart increase
    And user enter lowercase char and verify level chart increase
    And user enter a digit and level chart increase
    And user enter special char and verify level chart increase
  And user enter any 3 char and verify level chart becames full green



    Examples:
      | password        | currentPassword | newPassword     |
      | t7cvNb.vSs7qB5E | t7cvNb.vSs7qB5E | t7cvNb.vSs7qB5E |
