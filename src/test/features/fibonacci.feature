Feature: Fibonacci Function
  The Fibonacci function returns the nth Fibonacci number where the sequence starts at 0, 1, 1, 2, 3...

  Scenario Outline: Valid Fibonacci number calculation
    Given I have a calculator
    When I calculate the Fibonacci number for <index>
    Then the Fibonacci result should be <result>

    Examples:
      | index | result |
      | 0     | 0      |
      | 1     | 1      |
      | 2     | 1      |
      | 3     | 2      |
      | 4     | 3      |
      | 5     | 5      |
      | 7     | 13     |
      | 10    | 55     |

  Scenario Outline: Invalid Fibonacci number calculation
    Given I have a calculator
    When I calculate the Fibonacci number for <index>
    Then an IllegalArgumentException should be thrown

    Examples:
      | index |
      | -1    |
      | -5    |
      | -10   |
C