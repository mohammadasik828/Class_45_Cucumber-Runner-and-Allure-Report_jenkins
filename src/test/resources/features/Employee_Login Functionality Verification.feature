Feature: Login Functionality Verification

  @smoke
  Scenario Outline: Login as a Employee
    Given I am in Landing Home Page E
    When I Click on Login button
    Then I will be in Login Page Employee
    Then I enter User Id Employee "testpilot@gmail.com"
    And I enter Password Employee "1234"
    When I click Employee Login Button
    Then I will see Employee Home Page
