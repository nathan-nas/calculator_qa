Feature: Power operation in the calculator

  Scenario: Calculate power of a positive base with a positive exponent
    Given I have a calculator
    When I calculate 3 to the power of 4
    Then the result should be 81

  Scenario: Calculate power of a positive base with an exponent of zero
    Given I have a calculator
    When I calculate 6 to the power of 0
    Then the result should be 1

  Scenario: Calculate power of zero base with a positive exponent
    Given I have a calculator
    When I calculate 0 to the power of 5
    Then the result should be 0

  Scenario: Calculate power of a negative base with a positive exponent
    Given I have a calculator
    When I calculate -2 to the power of 3
    Then the result should be -8

  Scenario: Calculate power of a base with an exponent of one
    Given I have a calculator
    When I calculate 9 to the power of 1
    Then the result should be 9
