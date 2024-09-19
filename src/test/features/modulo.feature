Feature: Modulo operation in the calculator

  Scenario: Calculate modulo of two positive numbers
    Given I have a calculator
    When I calculate 10 modulo 3
    Then the result should be 1

  Scenario: Calculate modulo of a positive number by a negative number
    Given I have a calculator
    When I calculate 10 modulo -3
    Then the result should be 1

  Scenario: Calculate modulo of a negative number by a positive number
    Given I have a calculator
    When I calculate -10 modulo 3
    Then the result should be 2

  Scenario: Calculate modulo of two negative numbers
    Given I have a calculator
    When I calculate -10 modulo -3
    Then the result should be 2

  Scenario: Calculate modulo of zero by a positive number
    Given I have a calculator
    When I calculate 0 modulo 5
    Then the result should be 0

  Scenario: Attempt to calculate modulo by zero (expecting an exception)
    Given I have a calculator
    When I calculate 10 modulo 0
    Then an ArithmeticException should be thrown
