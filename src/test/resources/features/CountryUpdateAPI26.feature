@CountryUpdate
Feature: US_26 System should allow to update countries using api end point
  "https://www.gmibank.com/api/tp-countries"

  @US_26
  Scenario Outline: :User can just update each country 1 by 1
    Given Use api end point  "https://www.gmibank.com/api/tp-countries/"
    And  User send a Put request endpoint "https://www.gmibank.com/api/tp-countries/" and update countries using "<id>" and "<name>"
    Then User verify the country was updated

  Examples:
    |id   |name  |
    |24104|Norvec|