package StepDefinitions;

/*
    Source code is based on the material from Katalon:
    https://github.com/katalon-studio/testops-junit4
 */

//This is a simple Calculator class that performs basic arithmetic operations.
public class Calculator {

    // This method is named 'add'. It takes two integers as input (parameters) named
    // 'a' and 'b'.
    // It returns the sum of 'a' and 'b'.
    public int add(int a, int b) {
        return a + b;
    }

    // This method is named 'subtract'. It takes two integers as input (parameters)
    // named 'a' and 'b'.
    // It returns the result of 'a' subtracted by 'b'.
    public int subtract(int a, int b) {
        return a - b;
    }

    // This method is named 'multiply'. It takes two integers as input (parameters)
    // named 'a' and 'b'.
    // It returns the product of 'a' and 'b'.
    public long multiply(int a, int b) {
        return a * b;
    }

    // This method is named 'divide'. It takes two integers as input (parameters)
    // named 'a' and 'b'.
    // It returns the result of 'a' divided by 'b'.
    // If 'b' is zero, it throws an IllegalArgumentException. This is to prevent
    // division by zero, which is undefined.
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return (double) a / (double) b;
    }

    // Method to calculate the GCD (Greatest Common Divisor)
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;  // When b is 0, return a as the GCD
        }
        return gcd(b, a % b);  // Recursively call gcd with the remainder
    }


    public int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; // LCM of zero with any number is zero
        }
        int gcdValue = gcd(a, b);
        int lcmValue = Math.abs(a * b) / gcdValue;
        return lcmValue;
    }

    // Method to calculate the nth Fibonacci number using recursion
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

