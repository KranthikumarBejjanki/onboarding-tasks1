Feature: Test click on login button

  @First
  Scenario: Check login is displayed successfully
    Given enter url in the browser
    When User click on login button
    And User click on continue button
    Then User should see error message