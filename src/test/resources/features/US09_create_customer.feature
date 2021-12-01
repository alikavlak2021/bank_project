@login
Feature: user can login with valid credentials
@customer_creation_byEmployee
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
  Then verify that First Name is populated
  And verify that Last Name is populated
#  And verify that Middle Initial is populated
  And verify that email is populated
  And verify that Mobile Phone Number is populated
#  And verify that Phone Number is populated
#  And verify that Zip Code is populated
  And verify that Address is populated
#  And verify that city is populated
  And verify that SSN is populated
  And verify that Create Date is populated
#  And verify that Country is populated
#  And verify that State is populated
#  And verify that Account is populated








  Examples:
    |employee_username|employee_password|SSN        |
    |bf_employee1     |Magic46.         |432-76-2386|




  @customer_login
  Scenario Outline:
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters username "<customer_username>"
    And user enters password "<customer_password>"
    And user enters Sing in button
    Then verify that user successfully logins to the account
#    And user navigates the default page
#    And user clicks the My Operations


    Examples:
      |customer_username|customer_password|
      |bf_customer1     |Customer1*       |