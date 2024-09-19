Feature: Least Common Multiple (LCM) operation in Calculator

  Scenario: Calculate LCM of two positive integers
    Given I have a Calculator
    When I calculate the LCM of 4 and 5
    Then the result should be 20

  Scenario: Calculate LCM when one number is zero
    Given I have a Calculator
    When I calculate the LCM of 0 and 10
    Then the result should be 0

  Scenario: Calculate LCM of two co-prime numbers
    Given I have a Calculator
    When I calculate the LCM of 7 and 11
    Then the result should be 77

  Scenario: Calculate LCM of negative and positive number
    Given I have a Calculator
    When I calculate the LCM of -6 and 15
    Then the result should be 30
