Feature: Test Cogmento App

  @LoginFunctionality
  Scenario: Validate Login Functionality
    Given user is on homepage with browserName "Chrome"
    When user Enter valid Credentials
    Then user click on LoginBtn
