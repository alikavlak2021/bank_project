Feature: Create a New Account
  @newAccount
  Scenario Outline: US13 An Employee can create a new Account
    Given user is on the main  page
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters Username "<UserName>"
    And user enters Password "<Password>"
    And user enters Sing in button
    And user navigates the default page
    And user clicks the My Operations
    And user clicks the Manage Accounts
    And user navigates the account page
    And user clicks Create a new Account button


    Examples:
    |UserName|Password|
    |bf_employee1|Magic46.|

