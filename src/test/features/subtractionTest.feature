Feature: Subtraction operation in Calculator

  Scenario: Subtract two positive integers
    Given I have a Calculator
    When I subtract 5 from 10
    Then the result should be 5

  Scenario: Subtract a negative integer from a positive integer
    Given I have a Calculator
    When I subtract -3 from 7
    Then the result should be 10

  Scenario: Subtract a larger number from a smaller number
    Given I have a Calculator
    When I subtract 8 from 3
    Then the result should be -5
