Feature: DSl Tariff Functionality


  Scenario: Dsl Tariff Select
    Given Navigate to Telefon Vertrag Dsl Page
    When the information of the Dsl tariffs should be appear
    Then User should be able to see the correct information about selected DSL product
    And Extra products should be purchased according to the tariff.
    Then Total paycheck between the shopping cart and the personal information page
    And fill the form and test bank details negative
