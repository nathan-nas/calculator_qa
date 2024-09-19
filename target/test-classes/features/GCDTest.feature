Feature: Greatest Common Divisor (GCD) operation in Calculator

  Scenario: Calculate GCD of two positive integers
    Given I have a Calculator
    When I calculate the GCD of 48 and 18
    Then the result should be 6

  Scenario: Calculate GCD when one number is zero
    Given I have a Calculator
    When I calculate the GCD of 0 and 15
    Then the result should be 15

  Scenario: Calculate GCD of two co-prime numbers
    Given I have a Calculator
    When I calculate the GCD of 13 and 17
    Then the result should be 1

  Scenario: Calculate GCD of negative and positive number
    Given I have a Calculator
    When I calculate the GCD of -12 and 18
    Then the result should be 6
