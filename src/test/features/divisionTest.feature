Feature: Division operation in Calculator

  Scenario: Divide two positive integers
    Given I have a Calculator
    When I divide 10 by 2
    Then the result should be 5.0

  Scenario: Divide a positive integer by a negative integer
    Given I have a Calculator
    When I divide 10 by -2
    Then the result should be -5.0

  Scenario: Divide a number by zero
    Given I have a Calculator
    When I divide 10 by 0
    Then I should get an IllegalArgumentException with message "Divisor cannot be zero."

  Scenario: Divide zero by any integer
    Given I have a Calculator
    When I divide 0 by 5
    Then the result should be 0.0
