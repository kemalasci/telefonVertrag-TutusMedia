Feature: Kabel Functionality
  @RegressionTest
  Scenario: Kabel Tariff select
    Given navigate to Telefon Vertrag Kabel page
    When the information of the tariffs should be appear
    Then User should be able to see the correct information about selected product
    Then user should be able to write a comment about selected tariff
    Then user should be able to add tariff to the cart and place their order

