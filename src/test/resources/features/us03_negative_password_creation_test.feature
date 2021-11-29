
@Password_Strength_Test
Feature: Register new applicants
  Background: Out Of Duty
    Given user is on the main  page
    And user verifies the GMIBANK text

  @Registration_Page_Password_Strength_Test
  Scenario Outline: US03_Registration_Page_Password_Negative_Test
    And navigates the registration page
    And user enters SSN "<SSN>" number
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters phonenumber "<phonenumber>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters negative password With Capital Char "<newpassword>"
    And user enters negative password With Small Char  "<newpassword>"
    And user enters negative password With Special Char  "<newpassword>"
    And user enters negative password With Digits  "<newpassword>"
    And user enters new password "<newpassword>"
    And user enters different from first password "<newpassword2>"
    Then  user verifies different from first password message
     And user enters new password2 "<newpassword>"
    And click the register button
    And user close the application

    Examples: registration page password negative test
      | SSN         | firstname | lastname | address       | phonenumber | username | email            | newpassword  | newpassword2 |
      | 256-45-7862 | James     | Prosper  | Dar-Es-Salaam | 9515555495  | jemo     | jemo45@gmail.com | bug-finder01 | bug-finder01 |



