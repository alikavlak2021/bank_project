@CustomerAPI9
  Feature: API data reading

    Background: Set the API data into response
      Given user uses api end point "https://www.gmibank.com/api/tp-customers?=size=2" to get all customers

      Scenario: get api data and validate
        Given user should get all customer data and deserialize data to java
        And user saves the customer data to correspondent files
        Then user needs to validate all customer api data