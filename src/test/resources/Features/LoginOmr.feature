Feature: Verifying the omrbranch login details

  Scenario: Verifying omrbranch login with valid details
    Given User is on the omrbranch login page
    When User enters username and password
    And click login button
    Then User should verify after login success message
