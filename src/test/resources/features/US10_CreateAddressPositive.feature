@create_address_positive
Feature: create customer address positive with first try

  @register_with_java_faker
  Scenario: register with java faker

    Given user is on the main  page
    And user verifies the GMIBANK text
    And navigates the registration page
    And user enters SSN number with faker
    And user enters firstname with faker
    And user enters lastname with faker
    And user enters address with faker
    And user enters phonenumber with faker
    And user enters username with faker
    And user enters email with faker
    And user enters password with faker and then enters password2

    And click the register button to register with faker
    Then verify the success message

  @assign_employee_role
  Scenario Outline: assign employee role for this new registrant

    Given user is on the main  page
    And user navigates the sing in page
    And user enters Username "<admin_user>"
    And user enters Password "<admin_pw>"
    And click the signin button to login
    Then verify that user successfully logins to the account
    And user clicks administration then user management
    And user finds the new registrant
    And user assigns employee role to the new registrant
    And user signs out
    Examples:
      |admin_user    |admin_pw    |
      |marcia.leannon|A#Ip6A*06S1Gs&|


  @customer_creation_byEmployee
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
    And user enters "SSN" number of new registrant to search for the customer
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
      |employee_user | employee_pw |
      |bf_employee1  |Magic46.     |