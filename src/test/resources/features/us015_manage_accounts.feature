@manage_accounts
Feature: user can login with valid credentials
  @see_all_account_types
  Scenario Outline:
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters Username "<customer_username>"
    And user enters Password "<customer_password>"
    And user enters Sing in button
    Then verify that user successfully logins to the account
    And user clicks the My Operations
    And user clicks on My Accounts
    Then verify that all account types are displayed


    Examples:
      |customer_username|customer_password|
      |bf_customer1     |Customer1*       |

  @view_transactions
  Scenario Outline:
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters Username "<customer_username>"
    And user enters Password "<customer_password>"
    And user enters Sing in button
    Then verify that user successfully logins to the account
    And user clicks the My Operations
    And user clicks on My Accounts
    And user clicks on View Transaction
    Then verify that executed transactions are displayed


    Examples:
      |customer_username|customer_password|
      |bf_customer1     |Customer1*       |