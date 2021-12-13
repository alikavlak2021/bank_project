@us22_Customer
  Feature: Api data

    Background: read the api data into

  Given user uses api end point "https://www.gmibank.com/api/tp-states" to get all customer data

  Scenario: get api data and validate
    Given user should get all customer data and deserialize the data to java
    And user saves the customer data to correspondent file
    Then user needs to validate all customer api data


