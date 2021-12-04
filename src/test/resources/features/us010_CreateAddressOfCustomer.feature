@address_creation
  Feature: Address as street and number should be provided  and cannot be left blank


    Scenario Outline:
      Given user is on the main  page
      And user verifies the GMIBANK text
      And user navigates the sing in page
      And user verifies the sing in page
      And user enters Username "<employee_username>"
      And user enters Password "<employee_password>"
      And user enters Sing in button
      Then verify that user successfully logins to the account
      And user clicks the My Operations
      And user clicks Manage Customers
      And user clicks Create a new Customer
      And user enters "<SSN>" number to search for the customer
      And user clicks search button
      And user enters middle initial "<middle initial>"
      And user enters phone number "<phone number>"
      And user enters zip code "<zip code>"
      And user enters address "<street>" and "<number>"
      And user enters city "<city>"
      And user enters country "<country>"
      And user enters a state "<state>" from USA
      And user clicks on save button on customer_create page

      Examples:
|employee_username|employee_password|SSN        |middle initial|phone number|zip code|street  |number|city      |country|state|
|bf_employee1     |Magic46.         |432-76-2386|a         |951-525-1425    | 20007  |drone st|12    |Washington|USA    |DC   |
