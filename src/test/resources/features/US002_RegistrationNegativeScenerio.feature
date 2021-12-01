@registerNewUserUI002
Feature: Registration_negative

 Background: Register page negative scenerio

  Given user is on the main page
  And user navigates the registration page

    @Negative_registrationPage
   Scenario Outline: Negative registration

 And user enters a "<shortSSN>" number
 And user see the invalid short SSN message
 And user verify the short SSN invalid message
 And user enter "<charSSN>"
 And user see the invalid char SSN message
 And user verify the "<invalidSSN>" invalid message
 And user enters "<longSSN>" number
 And user see the invalid long SSN message
 And user verify the long SSN invalid message
 And user left it "<blankSSN>" Text box
 And user see the blank invalid SSN message
 And user verify the blank invalid SSN message
 And user left it "<blankFirstName>"
 And user see the  blank invalid first name message
 And user verify the invalid first name message
 And user enters "<invalidLastname>"
 And user see the invalid last name message
 And user verify the last name invalid message
 And user enter "<invalid address>"
 And user see the invalid address message
 And user verify the invalid address message
 And user enter "<invalid phone number>"
 And user see the invalid phone number message
 And user enter invalid char phone number
 And user enters "<invalid email>"
 And user see the invalid email message



  Examples:
    |     shortSSN    |  charSSN| invalidSSN |    longSSN  | blankSSN |blankFirstName | invalidLastname      | invalid address|  invalid phone number|invalid email|
    |                 |         |            |             |           |              |                      |                |                      |             |