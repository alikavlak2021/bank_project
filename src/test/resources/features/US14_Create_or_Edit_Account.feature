Feature: Create or Edit Account
  @date
  Scenario Outline: US14 Date should be created on the time of account creation
    Given user is on the main  page
    And user verifies the GMIBANK text
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
    And user navigates the Create or Edit Account Page
    And user enters Description "<Description>"
    And user enters Balance "<Balance>"
    And user selects Account Type
    And user selects Account Status Type
    And user enters Create Date
    And user enters Closed Date
    Then user clicks Save button
    Then verify the success message

    Examples:
      |UserName|Password|Description|Balance|
      |bf_employee1|Magic46.|BugFinder|1500 |