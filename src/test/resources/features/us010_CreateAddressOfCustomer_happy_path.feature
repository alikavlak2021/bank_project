@create_address_for_customer_happy_path
Feature: create address for customer

    Background:
    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sign in page as a signed out user
    And user enters Username "bf_employee1"
    And user enters Password "Magic46."
    And user enters Sing in button
    Then verify that user successfully logins to the account
    And user clicks the My Operations
    And user clicks Manage Customers
    And user clicks Create a new Customer

  @TC01_02_address_and_city_are_blank
    Scenario: Address and city should be provided  and cannot be left blank
    And user enters "563-47-0663" number of new registrant to search for the customer
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

    And user enters address with faker
    And user clears city field
    And user clicks on save button on customer_create page
    Then verify the error message for city field
    Then user signs out of employee account

  @TC05_address_creation_with_valid_entries
  Scenario: Address of customer can be created with valid data
    And user enters "563-47-0663" number of new registrant to search for the customer
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
    Then user signs out of employee account
