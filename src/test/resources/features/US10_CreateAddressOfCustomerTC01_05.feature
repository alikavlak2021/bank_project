@end_to_end_test
Feature: Address of customer can be created from the very beginning

#  @register_with_java_faker
#  Scenario: register with java faker
#
#    Given user is on the main  page
#    And user verifies the GMIBANK text
#    And navigates the registration page
#    And user enters SSN number with faker
#    And user enters firstname with faker
#    And user enters lastname with faker
#    And user enters address with faker
#    And user enters phonenumber with faker
#    And user enters username with faker
#    And user enters email with faker
#    And user enters password with faker and then enters password2
#
#    And click the register button to register with faker
#    Then verify the success message
#
#  @assign_employee_role
#  Scenario Outline: assign employee role for this new registrant
#
#    Given user is on the main  page
#    And user navigates the sing in page
#    And user enters Username "<admin_user>"
#    And user enters Password "<admin_pw>"
#    And click the signin button to login
#    Then verify that user successfully logins to the account
#    And user clicks administration then user management
#    And user finds the new registrant
#    And user assigns employee role to the new registrant
#    And user signs out
#    Examples:
#      |admin_user    |admin_pw    |
#      |marcia.leannon|A#Ip6A*06S1Gs&|


  @TC01_address_is_blank
    Background:
    Scenario Outline: Address as street and number should be provided  and cannot be left blank
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

    And user clears address field
    And user enters city with faker
    And user enters country as USA
    And user enters a state from USA with faker
    And user clicks on save button on customer_create page
    Then verify the error message for address field
    Examples:
      |employee_user | employee_pw | SSN |
      |bf_employee1  |Magic46.     |530-21-2868|

  @TC02_city_is_blank
  Scenario: City should be provided  and cannot be left blank
    And user enters address with faker
    And user clears city field
    And user enters country as USA
    And user enters a state from USA with faker
    And user clicks on save button on customer_create page
    Then verify the error message for city field

  @TC03_country_is_blank
  Scenario: Country should be provided  and cannot be left blank
    And user enters address with faker
    And user enters city with faker
    And user clears country field
    And user enters a state from USA with faker
    And user clicks on save button on customer_create page
    Then verify the error message for country field

  @TC04_state_is_blank
  Scenario: State should be provided as US state and cannot be blank
    And user enters address with faker
    And user enters city with faker
    And user enters country as USA
    And user clears state field
    And user clicks on save button on customer_create page
    Then verify the error message for state field

  @TC05_address_creation_with_valid_entries
  Scenario: Address of customer can be created with valid data
    And user enters address with faker
    And user enters city with faker
    And user enters country as USA
    And user enters a state from USA with faker
    And user clicks on save button on customer_create page
    Then verify the success message on customer creation page

  @TC06_address_creation_with_used_ssn
  Scenario Outline: Address of customer can be created with valid data
    And user enters address with faker
    And user enters city with faker
    And user enters country as USA
    And user enters a state from USA with faker
    And user clicks on save button on customer_create page
    Then verify the success message on customer creation page



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
      |bf_employee1  |Magic46.     |530-21-2868     |