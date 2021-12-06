@us11CustomerAccount_negative
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
    And user enters wrong mobile phone number "<WrongMobilePhoneNumber>"
    And user verifies the wrong mobile phone number
    And user enters wrong phone number "<WrongPhoneNumber>"
    And user verifies the wrong phone number
    And user enters zip code "<ZipCode>"
    And user enters address "<Address>"
    And user enters city "<City>"
    And user enters wrong ssn number "<WrongSsn>"
    And user verifies the wrong ssn
    And user enters Customer Create Date
    And user clicks the Country dropbox
    And user select USA
    And user enters customer state "<State>"
    And user clicks User dropbox
    And user selects cup-tan cup ay
    And user clicks account box
    And user select test account from options
    And user click the zelle enrolled
    When user clicks Save button
    Then user verifies the success message


    Examples:
      |UserName     |Password  |FirstName |LastName | MiddleInitial| Email         |WrongMobilePhoneNumber  | WrongPhoneNumber | ZipCode | Address | City  | WrongSsn | State |
      |bf_employee1 |Magic46.  |Bug-Bug   |Bugov    |Bugiii        |bugi@gmail.com |2223335555              |1237894444        |787      |Bug77     |Boston|111222235 |Boston|