@Employee
Feature: Employee Login Functionality
  Description:
  As an Employee
  I want to Login as Employee
  So that I can see Employee Home page

  @Test2
  Scenario: Verify Employee Login Functionality Test2
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Employee Login Menu
    And I Enter Employee User Id
    And I enter Employee Password
    When I click on Employee Login button
    Then Verify I am in Employee Home Page

  @Test3
  Scenario: Verify Employee Login Functionality Test3
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Employee Login Menu
    And I Enter Employee User Id
    And I enter Employee Password
    When I click on Employee Login button
