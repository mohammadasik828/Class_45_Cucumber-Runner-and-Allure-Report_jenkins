@Employee
Feature: Employee Login Functionality
  Description:
  As an Employee
  I want to Login as Employee
  So that I can see Employee Home page

  @smoke
  Scenario: Verify Employee Login Functionality Test2
    And I click on Employee Login Menu
    And I Enter Employee User Id
    And I enter Employee Password
    When I click on Employee Login button
    Then Verify I am in Employee Home Page

