Feature: Address of customer can be created with used SSN

@TC06_address_creation_with_used_ssn
Scenario Outline:
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
|bf_employee1  |Magic46.     |432-76-2386     |