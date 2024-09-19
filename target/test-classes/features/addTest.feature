Feature: Addition operation in the calculator

  Scenario: Add two positive numbers
    Given I have a calculator
    When I add 5 and 3
    Then the result should be 8

  Scenario: Add a positive number and a negative number
    Given I have a calculator
    When I add 5 and -2
    Then the result should be 3

  Scenario: Add two negative numbers
    Given I have a calculator
    When I add -4 and -6
    Then the result should be -10
