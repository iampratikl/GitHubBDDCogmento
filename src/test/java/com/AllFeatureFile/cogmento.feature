Feature: Test Cogmento App

  @LoginFunctionality
  Scenario: Validate Login Functionality
    Given user is on homepage with browserName "Chrome"
    When user Enter valid Credentials
    Then user click on LoginBtn

  @AddcontactFunctionality
  Scenario: Validate Addcontact Functionality
    Given user will on homepage
    When user clicked on addcontact
    And user enter firstname and lastname
    And user select social channel as "Instagram"
    Then user is click on save button
