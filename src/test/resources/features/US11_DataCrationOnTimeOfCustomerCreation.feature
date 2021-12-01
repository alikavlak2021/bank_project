@us11CustomerAccount
Feature: Data Creation On Time Of Customer Creation


  Scenario Outline: US11_Date should be created on the time of customer creation

    Given user is on the main  page
    And user verifies the GMIBANK text
    And user navigates the sing in page
    And user verifies the sing in page
    And user enters Username "<UserName>"
    And user enters Password "<Password>"
    And user enters Sing in button
    And user navigates the default page
    And user clicks the My Operations
    And user clicks the Manage Customers
    And user navigates the Customers Page
    And user clicks Create a new Customer
    And user verifies the Create or edit a Customer text
    #And user enters SSN "<SSN>"
    #And user clicks Search button
    And user enters firstname "<FirstName>"
    And user enters lastname "<LastName>"
    And user enters middleInitial "<MiddleInitial>"
    And user enters an email "<Email>"
    And user enters mobile phone number "<MobilePhoneNumber>"
    And user enters phone number "<PhoneNumber>"
    And user enters zip code "<ZipCode>"
    And user enters address "<Address>"
    And user enters city "<City>"
    And user enters ssn number "<Ssn>"
    And user enters Create Date
    And user clicks the Country dropbox
    And user select USA
    And user enters state "<State>"
    And user clicks User dropbox
    And user selects cup-tan cup ay
    And user clicks account box
    And user select test account from options
    And user click the zelle enrolled
    When user clicks Save button
    Then user verifies the success message
    Examples:
      |UserName     |Password|FirstName|LastName|MiddleInitial|Email              |MobilePhoneNumber|PhoneNumber |ZipCode|Address|City  |Ssn        |
      |bf_employee1 |Magic46.|Bug-Bug  |Bugov   |Bugiii       |bugi@gmail.com     |222-333-5555     |123-789-4444|787    |Bug77  |Boston|111-22-2235|

