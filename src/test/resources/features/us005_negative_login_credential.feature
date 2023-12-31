
@Login_Functionality
Feature: Login Functionality
  Background:
    Given  user is on the main  page
    And user verifies the GMIBANK text
    When navigates the login page

@Username_Negative_Test_On_Login_Page
Scenario Outline: username is invalid

  And user enters username on login page "<username>"
  And user enters password on login page "<password>"
  And click the sign in button
  And user verifies the check your credentials and try again
  And user close the application
   # username is invalid
Examples: login page negative password test
  | username     | password   |
  | customer1    | Customer1* |

@password_Is_Invalid_Test_On_Login_Page
Scenario Outline: password is invalid

  And user enters username on login page "<username>"
  And user enters password on login page "<password>"
  And click the sign in button
  And user verifies the check your credentials and try again
  And user close the application
  # password is invalid
Examples: login page negative password test
  | username     | password  |
  | bf_customer1 | Customer1 |

@username_password_Are_Invalid_Test_On_Login_Page
Scenario Outline: both of them are invalid


  And user enters username on login page "<username>"
  And user enters password on login page "<password>"
  And click the sign in button
  And user verifies the check your credentials and try again
  And user close the application
  # both of them are invalid
Examples: login page negative password test
  | username  | password  |
  | customer1 | Customer1 |

  @password_reset
  Scenario Outline: password reset

    And user enters username on login page "<username>"
    And user enters password on login page "<password>"
    And user clicks on the Did you forget your password? link
    Then user verifies the Did you forget your password? text
    And user close the application
    Examples: password reset
      | username  | password  |
      | customer1 | Customer1 |

  @Create_New_Account
  Scenario Outline: Create New Account

    And user enters username on login page "<username>"
    And user enters password on login page "<password>"
    And user clicks on the Register a new account link
    Then user verifies the Register a new account text
    And user close the application
    Examples: New Account
      | username  | password  |
      | customer1 | Customer1 |

  @valid_Test_On_Login_Page
  Scenario Outline: Valid credentials

    And user enters username on login page "<username>"
    And user enters password on login page "<password>"
    And click the sign in button
    And user verifies the success entrance message
    And user close the application
        #Both are valid
    Examples: login page negative password test
      | username  | password  |
      | bf_customer1 | Customer1* |