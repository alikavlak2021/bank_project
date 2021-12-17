@us22_States
  Feature: Api data reading

    Background: read the api data into response

  Given user uses api end point "https://www.gmibank.com/api/tp-states"

  Scenario: get api data and validate
    Given user should get all states data and deserialize the data to java
    And user saves the states data to correspondent file
    Then user needs to validate all states api data







