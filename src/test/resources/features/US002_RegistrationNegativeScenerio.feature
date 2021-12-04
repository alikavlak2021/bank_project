@test
Feature: Registration_negative

    @Negative_registrationPage
  Scenario Outline: Negative

 Given user is on the main page
 And user navigates the registration page
 And user enters invalid shortSSN "<shortSSN>"
 And user verify the short SSN invalid message
 And user enter charSSN "<charSSN>"
 And user verify the "<invalidSSN>" invalid message
 And user enters "<longSSN>" number
 And user verify the long SSN invalid message
 And user left it "<blankSSN>" Text box
 And user verify the blank invalid SSN message
 And user left it "<blankFirstName>"
 And user verify the invalid first name message
 And user enters invalidLastname "<invalidLastname>"
 And user verify the last name invalid message
 And user enter invalid address "<invalid address>"
 And user verify the invalid address message
 And user enter invalid phone number "<invalid phone number>"
 And user see the invalid phone number message
 And user enter invalid char phone number
 And user enters invalid email "<invalid email>"
 And user see the invalid email message
 And user close the application


  Examples: negative test
   | shortSSN | charSSN  | invalidSSN | longSSN     | blankSSN | blankFirstName | invalidLastname | invalid address | invalid phone number | invalid email |
   | 636396   | 23hhja.1 | jjh        | 51511151812 |          |                |                 | jhjk            | bhjjh                | kjfd@         |