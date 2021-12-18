@Customer23
  Feature: Api applicants data reading

  Background: set the API data into response

  Given user uses API and ENDPOINT "https://www.gmibank.com/api/tp-account-registrations" to get all Applicants

    Scenario: get API data and validate

      Given user should get all Applicants and deserialize the data to java
      And user saves the applicants to correspondent files
      Then user needs to validate all applicant api data