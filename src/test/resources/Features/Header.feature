Feature: Verifying Amazon Page

  Scenario: Verifying amazon  page product search
    Given User is on the Amazon page
    When User search for any product
      | Tv             |
      | Laptop         |
      | WashingMachine |
      | IOS            |
    Then user should verify all the product listed
