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
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate the LCM (Least Common Multiple)
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // LCM(a, b) = |a * b| / GCD(a, b)
    }

    // Method to calculate the nth Fibonacci number using recursion
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int result = a - (a / b) * b;
        return (result < 0) ? result + b : result;
    }

    // Function to calculate the power (iterative)
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
