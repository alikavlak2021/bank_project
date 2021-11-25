@registerNewUserUI002
Feature: Registration_negative

    @Negative_registrationPage
   Scenario Outline: Register new users for GMI Bank
 Given user is on the main  page
 And user verifies the GMIBANK text
 And navigates the registration page
 And user enters a short SSN "<SSN>" number
 And verify the short SSN message
 And user enter char character "<SSN>"
 And user enters long SSN "<SSN>" number
 And user enters firstname "<firstname>"
 And user enters lastname "<lastname>"
 And user enters address "<address>"
 And user enters phonenumber "<phonenumber>"
 And user enter char character "<phonenumber>"
 And user verify invalid attempt
 And user enters username "<username>"
 And user left blank "<username>"
 And user verify invalid attempt
 And user enters email "<email>"
 And user enter email without @ sign "<email>"
 And user verify invalid attempt
 And user enter email without . extensions "<SSN>"
 And user verify invalid attempt
 And user enters new password "<newpassword>"
 And user enters new password "<newpassword2>"
 And click the registration button
 And verify the success message

  Examples:
    | SSN         | firstname | lastname | address       | phonenumber | username | email       | newpassword  | newpassword2 |