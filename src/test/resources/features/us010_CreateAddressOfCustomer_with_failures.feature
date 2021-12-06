@Address_creation_failing_scenarios
Feature: Address of customer can be created with used SSN

  @TC03_country_blank
  Scenario Outline:Country should be provided cannot be blank
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters Username "<employee_user>"
    And user enters Password "<employee_pw>"
    And user enters Sing in button
    Then verify that user successfully logins to the account
    And user clicks the My Operations
    And user clicks Manage Customers
    And user clicks Create a new Customer
    And user enters "<SSN>" number of new registrant to search for the customer
    And user clicks search button
    And user enters middle initial with faker
    And user enters phone number with faker
    And user enters zip code with faker
    And user enters address with faker
    And user enters city with faker
    And user clears country field
    And user enters a state from USA with faker
    And user clicks on save button on customer_create page
    Then verify the error message for country field
    Examples:
      |employee_user | employee_pw | SSN |
      |bf_employee1  |Magic46.     |393-70-9615    |

  @TC04_state_blank
  Scenario Outline:State should be provided as US state and cannot be blank
    Given user signs out of employee account
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters Username "<employee_user>"
    And user enters Password "<employee_pw>"
    And user enters Sing in button
    Then verify that user successfully logins to the account
    And user clicks the My Operations
    And user clicks Manage Customers
    And user clicks Create a new Customer
    And user enters "<SSN>" number of new registrant to search for the customer
    And user clicks search button
    And user enters middle initial with faker
    And user enters phone number with faker
    And user enters zip code with faker
    And user enters address with faker
    And user enters city with faker
    And user enters country as USA
    And user clears state field
    And user clicks on save button on customer_create page
    Then verify the error message for state field
    Examples:
      |employee_user | employee_pw | SSN |
      |bf_employee1  |Magic46.     |885-98-3613|

@TC06_address_creation_with_used_ssn
Scenario Outline: address creation with used customer ssn
Given user signs out of employee account
Given user is on the main  page
And user verifies the GMIBANK text
And user navigates the sing in page
And user verifies the sing in page
And user enters Username "<employee_user>"
And user enters Password "<employee_pw>"
And user enters Sing in button
Then verify that user successfully logins to the account
And user clicks the My Operations
And user clicks Manage Customers
And user clicks Create a new Customer
And user enters "<SSN>" number of new registrant to search for the customer
And user clicks search button
And user enters middle initial with faker
And user enters phone number with faker
And user enters zip code with faker
And user enters address with faker
And user enters city with faker
And user enters country as USA
And user enters a state from USA with faker
And user clicks on save button on customer_create page
Then verify the success message on customer creation page
Examples:
|employee_user | employee_pw | SSN |
|bf_employee1  |Magic46.     |885-98-3613     |