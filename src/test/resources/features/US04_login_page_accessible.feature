@login
Feature: Login page should accessible with valid credentials

  Background:
    Given user is on the main  page
    And navigates the login page

  @validcredentials
  Scenario Outline:
    Then user enters username on login page "<customer_username>"
    And user enters password on login page "<customer_password>"
    And clicks the signin button
    Then verifies the user successfully login
    And user close the application

    Examples:
      | customer_username  | customer_password  |
      | bf_customer1       | Customer1*         |


  @loginCanCancel
  Scenario Outline:
    Then user enters username "<customer_username>"
    And user enters Password "<customer_password>"
    Then user verify cancel button
    And user close the application

    Examples:
      | customer_username  | customer_password  |
      | bf_customer1       | Customer1*         |