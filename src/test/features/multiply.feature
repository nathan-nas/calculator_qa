Feature: Multiplication operation in the calculator

  Scenario: Multiply two positive numbers
    Given I have a calculator
    When I multiply 4 and 3
    Then the result should be 12

  Scenario: Multiply a positive and a negative number
    Given I have a calculator
    When I multiply 5 and -3
    Then the result should be -15

  Scenario: Multiply two negative numbers
    Given I have a calculator
    When I multiply -4 and -5
    Then the result should be 20

  Scenario: Multiply any number by zero
    Given I have a calculator
    When I multiply 7 and 0
    Then the result should be 0
